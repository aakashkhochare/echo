package in.dream_lab.echo.utils;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * Created by pushkar on 1/9/17.
 */
public class NifiCommPort {

    public NifiCommPort(boolean input, int id) {
        this.input = input;
        this.id = id;
        this.nifiId = null;
    }

    private boolean input;
    private int id;
    private String nifiId;

    public boolean isInput() { return this.input; }
    public void setInput(boolean input) {this.input = input;};

    public int getId() {return this.id;}
    public void setId(int id) {this.id = id;}

    public String getNifiId() {return this.nifiId;}
    public void setNifiId(String nifiId) {this.nifiId = nifiId;}

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NifiCommPort) == false) {
            return false;
        }
        NifiCommPort rhs = ((NifiCommPort) other);
        return new EqualsBuilder().append(id, rhs.id).isEquals();
    }
}
