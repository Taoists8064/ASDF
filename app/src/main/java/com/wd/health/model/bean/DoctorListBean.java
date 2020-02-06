package com.wd.health.model.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @ProjectName: WDHealth
 * @Package: com.wd.health.model.bean
 * @ClassName: DoctorListBean
 * @Description: java类作用描述
 * @Author: jialiang
 * @CreateDate: 2020/1/8 14:31
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/8 14:31
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class DoctorListBean implements Serializable {

    /**
     * result : [{"badNum":0,"doctorId":142,"doctorName":"xt","imagePic":"http://172.17.8.100/images/health/doctor/system_image_pic/system_image3.jpg","inauguralHospital":"清华大学附属医院","jobTitle":"主治医师","praise":"0.00%","praiseNum":0,"serverNum":4,"servicePrice":500},{"badNum":0,"doctorId":209,"doctorName":"?????","imagePic":"http://172.17.8.100/images/health/doctor/system_image_pic/system_image7.jpg","inauguralHospital":"?????","jobTitle":"主治医师","praise":"0.00%","praiseNum":0,"serverNum":2,"servicePrice":500},{"badNum":0,"doctorId":148,"doctorName":"夏天","imagePic":"http://172.17.8.100/images/health/doctor/system_image_pic/system_image2.jpg","inauguralHospital":"协和大学","jobTitle":"主任","praise":"0.00%","praiseNum":0,"serverNum":0,"servicePrice":500},{"badNum":0,"doctorId":129,"doctorName":"像风一样","imagePic":"http://172.17.8.100/images/health/doctor/system_image_pic/system_image4.jpg","inauguralHospital":"清华大学附属医院","jobTitle":"主治医师","praise":"0.00%","praiseNum":0,"serverNum":0,"servicePrice":500},{"badNum":5,"doctorId":65,"doctorName":"魏恒炜","imagePic":"http://172.17.8.100/images/health/doctor/system_image_pic/system_image3.jpg","inauguralHospital":"清华大学附属医院","jobTitle":"主任","praise":"50.00%","praiseNum":3,"serverNum":128,"servicePrice":500}]
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
         * badNum : 0
         * doctorId : 142
         * doctorName : xt
         * imagePic : http://172.17.8.100/images/health/doctor/system_image_pic/system_image3.jpg
         * inauguralHospital : 清华大学附属医院
         * jobTitle : 主治医师
         * praise : 0.00%
         * praiseNum : 0
         * serverNum : 4
         * servicePrice : 500
         */

        private int badNum;
        private int doctorId;
        private String doctorName;
        private String imagePic;
        private String inauguralHospital;
        private String jobTitle;
        private String praise;
        private int praiseNum;
        private int serverNum;
        private int servicePrice;

        public int getBadNum() {
            return badNum;
        }

        public void setBadNum(int badNum) {
            this.badNum = badNum;
        }

        public int getDoctorId() {
            return doctorId;
        }

        public void setDoctorId(int doctorId) {
            this.doctorId = doctorId;
        }

        public String getDoctorName() {
            return doctorName;
        }

        public void setDoctorName(String doctorName) {
            this.doctorName = doctorName;
        }

        public String getImagePic() {
            return imagePic;
        }

        public void setImagePic(String imagePic) {
            this.imagePic = imagePic;
        }

        public String getInauguralHospital() {
            return inauguralHospital;
        }

        public void setInauguralHospital(String inauguralHospital) {
            this.inauguralHospital = inauguralHospital;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public String getPraise() {
            return praise;
        }

        public void setPraise(String praise) {
            this.praise = praise;
        }

        public int getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(int praiseNum) {
            this.praiseNum = praiseNum;
        }

        public int getServerNum() {
            return serverNum;
        }

        public void setServerNum(int serverNum) {
            this.serverNum = serverNum;
        }

        public int getServicePrice() {
            return servicePrice;
        }

        public void setServicePrice(int servicePrice) {
            this.servicePrice = servicePrice;
        }
    }
}
