package gen.points.model;

import java.util.Comparator;

public class KdNode implements Comparable<KdNode>
{

	public final Point id;
	public final int k;
	public final int depth;

	public KdNode parent = null;
	public KdNode lesser = null;
	public KdNode greater = null;

	public KdNode(Point id) {
		this.id = id;
		this.k = 3;
		this.depth = 0;
	}

	public KdNode(Point id, int k, int depth) {
		this.id = id;
		this.k = k;
		this.depth = depth;
	}
	public static final Comparator<Point> X_COMPARATOR = new Comparator<Point>() {

		@Override
		public int compare(Point o1, Point o2) {
			

			if (o1.x < o2.x)
				return -1;
			if (o1.x > o2.x)
				return 1;
			return 0;
			
		}
	};

	public static final Comparator<Point> Y_COMPARATOR = new Comparator<Point>() {
		@Override
		public int compare(Point o1, Point o2) {
			
			if (o1.y < o2.y)
				return -1;
			if (o1.y > o2.y)
				return 1;
			return 0;
		}
	};

	public static final Comparator<Point> Z_COMPARATOR = new Comparator<Point>() {

		@Override
		public int compare(Point o1, Point o2) {
			
			if (o1.z < o2.z)
				return -1;
			if (o1.z > o2.z)
				return 1;
			return 0;
		}
	};


	public static int compareTo(int depth, int k, Point o1, Point o2) {
		int axis = depth % k;
		if (axis == KdTree.X_AXIS)
			return X_COMPARATOR.compare(o1, o2);
		if (axis == KdTree.Y_AXIS)
			return Y_COMPARATOR.compare(o1, o2);
		return Z_COMPARATOR.compare(o1, o2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return 31 * (this.k + this.depth + this.id.hashCode());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof KdNode))
			return false;

		KdNode kdNode = (KdNode) obj;
		if (this.compareTo(kdNode) == 0)
			return true;
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int compareTo(KdNode o) {
		return compareTo(depth, k, this.id, o.id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("k=").append(k);
		builder.append(" depth=").append(depth);
		builder.append(" id=").append(id.toString());
		return builder.toString();
	}
}
