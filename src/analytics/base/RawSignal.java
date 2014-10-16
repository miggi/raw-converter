package analytics.base;

/**
 * Created by omygryn on 10/14/14.
 */
public class RawSignal extends RawObject {
    final static String DEFAULT_SOURCE = "default";
    final static String EXTENDED_SOURCE = "extended";

    Object object;
    Object type;
    Object source;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
