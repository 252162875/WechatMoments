package cn.duanchao.wechatmoments.bean;

import java.util.ArrayList;
import java.util.List;

import cn.duanchao.wechatmoments.base.BaseBean;

/**
 *
 */

public class TweetsBean extends BaseBean {

    private ArrayList<DataBean> data;

    public ArrayList<DataBean> getData() {
        return data;
    }

    public void setData(ArrayList<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * comments : [{"content":"Good.","sender":{"avatar":"https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w","nick":"Super hero","username":"outman"}},{"content":"Like it too","sender":{"avatar":"https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w","nick":"Doggy Over","username":"inman"}}]
         * content : 沙发！
         * images : [{"url":"https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRDy7HZaHxn15wWj6pXE4uMKAqHTC_uBgBlIzeeQSj2QaGgUzUmHg"},{"url":"https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTlJRALAf-76JPOLohBKzBg8Ab4Q5pWeQhF5igSfBflE_UYbqu7"},{"url":"http://i.ytimg.com/vi/rGWI7mjmnNk/hqdefault.jpg"}]
         * sender : {"avatar":"https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w","nick":"Joe Portman","username":"jport"}
         */

        private String content;
        private SenderBean sender;
        private List<CommentsBean> comments;
        private List<ImagesBean> images;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public SenderBean getSender() {
            return sender;
        }

        public void setSender(SenderBean sender) {
            this.sender = sender;
        }

        public List<CommentsBean> getComments() {
            return comments;
        }

        public void setComments(List<CommentsBean> comments) {
            this.comments = comments;
        }

        public List<ImagesBean> getImages() {
            return images;
        }

        public void setImages(List<ImagesBean> images) {
            this.images = images;
        }

        public static class SenderBean {
            /**
             * avatar : https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w
             * nick : Joe Portman
             * username : jport
             */

            private String avatar;
            private String nick;
            private String username;

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }
        }

        public static class CommentsBean {
            /**
             * content : Good.
             * sender : {"avatar":"https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w","nick":"Super hero","username":"outman"}
             */

            private String content;
            private SenderBeanX sender;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public SenderBeanX getSender() {
                return sender;
            }

            public void setSender(SenderBeanX sender) {
                this.sender = sender;
            }

            public static class SenderBeanX {
                /**
                 * avatar : https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w
                 * nick : Super hero
                 * username : outman
                 */

                private String avatar;
                private String nick;
                private String username;

                public String getAvatar() {
                    return avatar;
                }

                public void setAvatar(String avatar) {
                    this.avatar = avatar;
                }

                public String getNick() {
                    return nick;
                }

                public void setNick(String nick) {
                    this.nick = nick;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }
            }
        }

        public static class ImagesBean {
            /**
             * url : https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRDy7HZaHxn15wWj6pXE4uMKAqHTC_uBgBlIzeeQSj2QaGgUzUmHg
             */

            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
