package exception;

import java.io.PrintStream;

public class CityRegisterResponse extends Exception {
    private boolean existing;
    private Boolean temporal;

    public boolean isExisting(){
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }

    @Override
    public String toString(){
        return "CityRegisterResponse{" +
                "existing=" + existing +
                ", temporal=" + temporal +
                '}';
    }


    public void printStackTrace(PrintStream out) {
    }
}
