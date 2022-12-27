package day42_Exceptions;


class FadyException extends RuntimeException {

    public FadyException(String message) {
        super(message);
    }

    public FadyException() {
        super("Time for a short break");
    }

    class NoBreakException extends Exception { // custom checked exception

    }

    public class CustomExceptions {
        public void main(String[] args) {

            // throw new FadyException("It's time for lunch break");


            try {
                throw new NoBreakException();
            } catch (NoBreakException e) {
                e.printStackTrace();
            }


        }

    }
}
