package gen.points.view;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import gen.points.model.KdNode;
import gen.points.model.KdTree;
import gen.points.model.Point;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class PointExController {
	@FXML
    private Label brows1pathlabel;
	@FXML
    private Label brows2pathlabel;
	@FXML
    private Label exchenged;
	@FXML
    private TextField dist;
	
	
   private File file1;
   private File file2;
	
	//List<Point> points = new LinkedList<Point>();// list for points from file1.txt
	//List<Point> points2 = new LinkedList<Point>();// list for points from file2.txt
	
	  
	   
	@FXML
	private void handleBrows1() {
	    FileChooser fc= new FileChooser();
	    fc.getExtensionFilters().add(new ExtensionFilter("Text Files", "*.txt"));
	    File f = fc.showOpenDialog(null);
	    
	    if(f!=null)
	    {
	    	brows1pathlabel.setText("Selected File: " + f.getAbsolutePath());	
	    }
		this.file1=f;
	    
	}
	
	@FXML
	private void handleBrows2()  {
	    FileChooser fc2= new FileChooser();
	    fc2.getExtensionFilters().add(new ExtensionFilter("Text Files", "*.txt"));
	    File f2 = fc2.showOpenDialog(null);
	    
	    if(f2!=null)
	    {
	    	brows2pathlabel.setText("Selected File: " + f2.getAbsolutePath());	
	    }
	    
	    this.file2=f2;
	    
	}
	
	
	@FXML
	private void handleExchange() throws NumberFormatException, IOException {
		 List<Point> points = new ArrayList<Point>();
		 List<Point> points2 = new ArrayList<Point>();
		  try {
				
				BufferedReader in = new BufferedReader(new FileReader(file1.getAbsolutePath()));
				String line;
				while ((line = in.readLine()) != null) {
					String[] coordinate = line.split(" ");
					points.add(new Point(Double.parseDouble(coordinate[0]), Double.parseDouble(coordinate[1]),
							Double.parseDouble(coordinate[2]), Double.parseDouble(coordinate[3]),
							Double.parseDouble(coordinate[4]), Double.parseDouble(coordinate[5]),
							Double.parseDouble(coordinate[6])));
					
					
					System.out.println("Loading points from file1...");
					
					
				}
				in.close();
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		   try {
			 
			   
			   

				BufferedReader in = new BufferedReader(new FileReader(file2.getAbsolutePath()));
				 
				String line;
				while ((line = in.readLine()) != null) {
					String[] coordinate = line.split(" ");
					points2.add(new Point(Double.parseDouble(coordinate[0]), Double.parseDouble(coordinate[1]),
							Double.parseDouble(coordinate[2]), Double.parseDouble(coordinate[3]),
							Double.parseDouble(coordinate[4]), Double.parseDouble(coordinate[5]),
							Double.parseDouble(coordinate[6])));
					System.out.println("Loading points from file2...");
				}
				in.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		   
		   
		KdTree tree = new KdTree(points2);// building 3d tree of points for easier searching of closest point
		KdNode nodes = tree.root;
		Point target; // found closest point
		String lineSeparator = System.getProperty("line.separator");
		long streamed = 1;
		long found = 0;
		

		for (Point assignedp : points) {
			target = closestPoint(nodes, assignedp, 0, null);// searching of closest point for assigned point
			// Changing of RGBS
			  if(distance(assignedp,target)<Integer.parseInt(dist.getText())) {
			assignedp.r = target.r;
			assignedp.g = target.g;
			assignedp.b = target.b;
			assignedp.s = target.s;
			
		 	}
			System.out.println("Found closest: " + found++ + " of " + points2.size());

		}
		// Streaming of resulting points
		try (FileWriter writer = new FileWriter("file3.txt", false)) {
			for (Point p : points) {

				System.out.println("Streamed: " + streamed++ + " of " + points.size());

				writer.write(p + lineSeparator);

			}
			writer.close();
		}

		catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
		  exchenged.setText("Points has been successfully exchenged");
	}
	
	
	
	

	public static Point closestPoint(KdNode tree, Point point, int depth, Point best) {

		if (tree == null) {

			return best;
		}

		int axis = depth % 3;
		Point next_best = null;
		KdNode next_branch = null;

		if (best == null || distance(point, best) > distance(point, tree.id)) {
			next_best = tree.id;
		} else {
			next_best = best;
		}

		switch (axis) {
		case 0:
			if (point.x <= tree.id.x) {
				next_branch = tree.lesser;
			} else {
				next_branch = tree.greater;
				if (next_branch == null) {
					next_branch = tree.lesser;
				}
			}

			break;
		case 1:
			if (point.y <= tree.id.y) {
				next_branch = tree.lesser;
			} else {
				next_branch = tree.greater;
				if (next_branch == null) {
					next_branch = tree.lesser;
				}
			}
			break;
		case 2:
			if (point.z <= tree.id.z) {
				next_branch = tree.lesser;
			} else {
				next_branch = tree.greater;
				if (next_branch == null) {
					next_branch = tree.lesser;
				}
			}
			break;
		default:
			break;
		}

		return closestPoint(next_branch, point, depth + 1, next_best);

	}
	
	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2) + Math.pow((p2.z - p1.z), 2));
	}
	
	
}
