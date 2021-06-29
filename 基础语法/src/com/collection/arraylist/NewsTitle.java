package com.collection.arraylist;
/*
新闻管理系统
可以存储各类新闻标题（ID，名称，创建者）
可以获取标题数量
可以逐条打印每条新闻的标题

 */
//public class NewsDB {
//
//}

public class NewsTitle implements Comparable{
    private int id;
    private String title;
    private String author;

    public NewsTitle(){}

    public NewsTitle(int id, String title, String author){
        this.id = id;
        this.author = author;package com.collection.arraylist;
/*
新闻管理系统
可以存储各类新闻标题（ID，名称，创建者）
可以获取标题数量
可以逐条打印每条新闻的标题

 */
//public class NewsDB {
//
//}

        public class NewsTitle implements Comparable{
            private int id;
            private String title;
            private String author;

            public NewsTitle(){}

            public NewsTitle(int id, String title, String author){
                this.id = id;
                this.author = author;
                this.title = title;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getAuthor() {
                return author;
            }

            public String getTitle() {
                return title;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            // 重写方法，定义新闻类的比较规则，根据id进行比较
            // 比较对象，当前新闻对象 和 object比
            @Override
            public int compareTo(Object o) {
                com.collection.arraylist.NewsTitle news = (com.collection.arraylist.NewsTitle) o;
                if(this.id==news.id){
                    return 0;
                }else if(this.id>news.id){
                    return 1;
                }else{
                    return -1;
                }
            }
        }
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // 重写方法，定义新闻类的比较规则，根据id进行比较
    // 比较对象，当前新闻对象 和 object比
    @Override
    public int compareTo(Object o) {
        NewsTitle news = (NewsTitle) o;
        if(this.id==news.id){
            return 0;
        }else if(this.id>news.id){
            return 1;
        }else{
            return -1;
        }
    }
}