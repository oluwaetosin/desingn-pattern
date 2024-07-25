import memento.Editor;
import memento.History;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            var editor = new Editor();
            var history = new History();
            editor.setContent("a");

            history.push(editor.createState());

            editor.setContent("b");

            history.push(editor.createState());

            editor.setContent("c");
            editor.restore(history.pop());

            System.out.println(editor.getContent());

    }
}