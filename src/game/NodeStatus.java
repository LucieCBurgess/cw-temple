package game;

import java.util.Objects;

/**
 * An instance maintains the status of a node -- it's id and its distance from the Orb.
 */
public class NodeStatus implements Comparable<NodeStatus> {
    private final long id;
    private final int distance;
    private final int distanceRows;
    private final int distanceColumns;

    /**
     * Constructor: an instance with id nodeId and distance dist.
     */
    /* package */ NodeStatus(long nodeId, int dist, int rows, int columns) {
        id = nodeId;
        distance = dist;
        distanceRows = rows;
        distanceColumns = columns;
    }

    /**
     * Return the Id of the Node that corresponds to this NodeStatus.
     */
    public long getId() {
        return id;
    }

    /**
     * Return the distance to the orb from the Node that corresponds to
     * this NodeStatus.
     */
    public int getDistanceToTarget() {
        return distance;
    }

    /**
     * @author lburge01
     * Return the distance to the orb from the Node that corresponds to
     * this NodeStatus, based on rows only
     */
    public int getDistanceToTargetRows() {
        return distanceRows;
    }
    
    /**
     * @author lburge01
     * Return the distance to the orb from the Node that corresponds to
     * this NodeStatus, based on columns only
     */
    public int getDistanceToTargetColumns() {
        return distanceColumns;
    }
    
    /**
     * Return a negative number, 0, or a positive number depending on
     * whether this is closer to, at the same distance, or farther from the Orb.
     */
    @Override
    public int compareTo(NodeStatus other) {
        return Integer.compare(distance, other.distance);
    }

    /**
     * Return true if orb is an instance of NodeStatus and has the same id as this one.
     */
    @Override
    public boolean equals(Object ob) {
        if (ob == this) {
            return true;
        }
        if (!(ob instanceof NodeStatus)) {
            return false;
        }
        return id == ((NodeStatus) ob).id;
    }

    /**
     * Return a hashcode for this, based solely on its id.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
