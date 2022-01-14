package model.handler;

public abstract class POSystemHandler {
    private POSystemHandler nextHandler;

    protected void doNext(Object... args) {
        nextHandler.handle(args);
    }

    protected abstract void handle(Object... args);

    public void setNextHandler(POSystemHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
