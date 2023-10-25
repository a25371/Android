package com.example.a20230929_loginandroid.login_user;

public interface Contract {
    public interface View{
        public void successLogin(User user);
        void failureLogin(String err);
        // void failureLogin(MyException err);
    }
    public interface Presenter{
        void login(String email,String pass);
        void login(User user);
        void login(ViewUser viewUser);

    }
    public interface Model{
        interface OnLoginUserL(){
            void onFinished();
            void onFailure(String err);
        }


    }
}
