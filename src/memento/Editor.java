package memento;

public class Editor {
    private  String content;

    public EditorState createState(){
        return  new EditorState(content);
    }

    public  void  Restore(EditorState state){
        content = state.getContent();
    }

    public void  setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public void  restore(EditorState stat){
        this.content = stat.getContent();
    }

}
