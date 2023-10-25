package com.example.a20230929_loginandroid.login_user;

import com.example.a20230929_loginandroid.beans.User;

public interface ContractLoginUser {
    public interface View{
        public void successLogin(User user); //Me viene del BACK
        void failureLogin(String err);          // Viene del BACK
        // void failureLogin(MyException err);
    }
    public interface Presenter{
        //void login(String email,String pass);
        void login(User user);      //Va hacia el BACK!!
        //void login(ViewUser viewUser);
        // VIEW-ORM
        // BEANS-ENTITIES
        // MVP-MVVM

    }
    public interface Model{
        interface OnLoginUserListener{
            void onFinished(User user); //vuelta!!
            void onFailure(String err);
        }

        void loginAPI(User user, OnLoginUserListener onLoginUserListener);


    }
}
