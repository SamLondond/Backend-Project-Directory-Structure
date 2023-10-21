package entity;

public class Dbutil {
    String id ;
    String sp ;
    String op ; String content ;

    @Override
    public String toString() {
        return "Record{" +
                "id='" + id + '\'' +
                ", sp='" + sp + '\'' +
                ", op='" + op + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
