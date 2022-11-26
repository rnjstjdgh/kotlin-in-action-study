package java_code.part4;

import kotlin_code.part4.State;
import kotlin_code.part4.View;
import org.jetbrains.annotations.NotNull;

public class Button implements View {

    private State state;

    public class ButtonState implements State {

    }

    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {
        this.state = state;
    }
}
