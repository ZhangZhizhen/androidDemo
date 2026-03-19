========================
    打白包专用空白工程
========================

须手动替换build.gradle内，包信息及版本参数(不限于包名、versionCode、versionName等)
须手动生成签名文件并修改签名文件配置，生成的keystore文件放到对应文件夹内
须手动替换AndroidManifest.xml「游戏名称」及「ICON」
须手动添加Facebook ID 因工程接入了 Facebook SDK 并在 AppActivity 进行了初始化