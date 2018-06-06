package gen.points.model;

import java.util.ArrayList;
import java.util.List;

public class KdTree {

	public int k = 3;
	public KdNode root = null;
	 

    private static void doSortX(List<Point> list,int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (list.get(i).x <= list.get(cur).x)) {
                i++;
            }
            while (j > cur && (list.get(cur).x<= list.get(j).x)) {
                j--;
            }
            if (i < j) {
                Point temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSortX(list,start, cur);
        doSortX(list,cur+1, end);
    }
    private static void doSortY(List<Point> list,int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (list.get(i).y <= list.get(cur).y)) {
                i++;
            }
            while (j > cur && (list.get(cur).y<= list.get(j).y)) {
                j--;
            }
            if (i < j) {
                Point temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSortY(list,start, cur);
        doSortY(list,cur+1, end);
    }
    
    private static void doSortZ(List<Point> list,int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (list.get(i).z <= list.get(cur).z)) {
                i++;
            }
            while (j > cur && (list.get(cur).z<= list.get(j).z)) {
                j--;
            }
            if (i < j) {
                Point temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSortZ(list,start, cur);
        doSortZ(list,cur+1, end);
    }

//	public static final Comparator<Point> X_COMPARATOR = new Comparator<Point>() {
//
//		@Override
//		public int compare(Point o1, Point o2) {
//			 counter2++;
//			 System.out.println("X"+counter2);
//
//			if (o1.x < o2.x)
//				return -1;
//			if (o1.x > o2.x)
//				return 1;
//			return 0;
//			
//		}
//	};

//	public static final Comparator<Point> Y_COMPARATOR = new Comparator<Point>() {
//		@Override
//		public int compare(Point o1, Point o2) {
//			counter2++;
//			 System.out.println(counter2);
//			if (o1.y < o2.y)
//				return -1;
//			if (o1.y > o2.y)
//				return 1;
//			return 0;
//		}
//	};

//	public static final Comparator<Point> Z_COMPARATOR = new Comparator<Point>() {
//
//		@Override
//		public int compare(Point o1, Point o2) {
//			counter2++;
//			 System.out.println(counter2);
//			if (o1.z < o2.z)
//				return -1;
//			if (o1.z > o2.z)
//				return 1;
//			return 0;
//		}
//	};

	public static final int X_AXIS = 0;
	public static final int Y_AXIS = 1;
	public static final int Z_AXIS = 2;
	public static long counter;
	public static long counter1;

	public KdTree() {
	}

	public KdTree(List<Point> list) {
		super();
		root = createNode(list, k, 0);

	}

	public KdTree(List<Point> list, int k) {
		super();
		root = createNode(list, k, 0);

	}

	private static KdNode createNode(List<Point> list, int k, int depth) {
		counter1++;
		System.out.println(counter1);
		if (list == null || list.size() == 0)
			return null;

		int axis = depth % k;
		if (axis == X_AXIS)
			doSortX( list,0, list.size()-1);
		else if (axis == Y_AXIS)
			doSortY( list,0, list.size()-1);
		else
			doSortZ( list,0, list.size()-1);

		KdNode node = null;
//		List<Point> less = new LinkedList<Point>();
//		List<Point> more = new LinkedList<Point>();
		 List<Point> less = new ArrayList<Point>();
		 List<Point> more = new ArrayList<Point>();
		if (list.size() > 0) {
			int medianIndex = list.size() / 2;
			node = new KdNode(list.get(medianIndex), k, depth);
			// Process list to see where each non-median point lies
			for (int i = 0; i < list.size(); i++) {
				if (i == medianIndex)
					continue;
				Point p = list.get(i);
				// Cannot assume points before the median are less since they could be equal
				if (KdNode.compareTo(depth, k, p, node.id) <= 0) {
					less.add(p);

				} else {
					more.add(p);

				}
			}

			if ((medianIndex - 1 >= 0) && less.size() > 0) {
				node.lesser = createNode(less, k, depth + 1);
				node.lesser.parent = node;
			}

			if ((medianIndex <= list.size() - 1) && more.size() > 0) {
				node.greater = createNode(more, k, depth + 1);
				node.greater.parent = node;
			}
		}
		counter++;
		System.out.println("TreeBuilding: " + counter);

		return node;
	}
}
