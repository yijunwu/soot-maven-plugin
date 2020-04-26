package net.nicoulaj.maven.plugins.soot;

import sun.misc.Signal;

@SuppressWarnings("restriction")
public final class SignalUtils {

    private static final Signal SIG_INT = new Signal("INT");

    private SignalUtils() {
    }

    /**
     * Handle {@literal INT} signals by calling the specified {@link Runnable}.
     * @param runnable the runnable to call on SIGINT.
     */
    public static void attachSignalHandler(Runnable runnable) {
        Signal.handle(SIG_INT, (signal) -> runnable.run());
    }

}
