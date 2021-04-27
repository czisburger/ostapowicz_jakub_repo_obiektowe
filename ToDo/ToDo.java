import java.time.LocalDate;

class ToDo{
    private String title="";
    private String content="";
    private String author="Anonymous";
    private LocalDate add_date;

    public ToDo(String title, String content){
        this.title=title;
        this.content=content;
        this.add_date=LocalDate.now();
    }

    public ToDo(String title, String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }

    public ToDo(String title, String content, String author, LocalDate add_date){
        this.title=title;
        this.content=content;
        this.author=author;
        this.add_date=LocalDate.now();
    }

    public String getContent(){
        return content;
    }

    public LocalDate getAdd_Date(){
        return add_date;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    
    @Override
    public String toString(){
        return "Title: "+title+"\n"
        +"Content: "+content+"\n"
        +"Author: "+author+"\n"
        +"Date: "+add_date+"\n";
    }
}