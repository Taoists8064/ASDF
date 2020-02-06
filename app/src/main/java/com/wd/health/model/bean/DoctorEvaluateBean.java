package com.wd.health.model.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @ProjectName: WDHealth
 * @Package: com.wd.health.model.bean
 * @ClassName: DoctorEvaluateBean
 * @Description: java类作用描述
 * @Author: jialiang
 * @CreateDate: 2020/1/8 14:48
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/8 14:48
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class DoctorEvaluateBean implements Serializable {

    /**
     * result : [{"commentTime":1564985498000,"content":"啦M8听哦肯德基","headPic":"http://172.17.8.100/images/health/user/head_pic/2019-07-29/20190729113034.jpeg","nickName":"别逼逼"},{"commentTime":1561447840000,"content":"很好","headPic":"http://172.17.8.100/images/health/user/head_pic/default/default_head_6.jpg","nickName":"hw_LLLYN"}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * commentTime : 1564985498000
         * content : 啦M8听哦肯德基
         * headPic : http://172.17.8.100/images/health/user/head_pic/2019-07-29/20190729113034.jpeg
         * nickName : 别逼逼
         */

        private long commentTime;
        private String content;
        private String headPic;
        private String nickName;

        public long getCommentTime() {
            return commentTime;
        }

        public void setCommentTime(long commentTime) {
            this.commentTime = commentTime;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getHeadPic() {
            return headPic;
        }

        public void setHeadPic(String headPic) {
            this.headPic = headPic;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }
    }
}
