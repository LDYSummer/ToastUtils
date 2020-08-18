# ToastUtils
[![](https://jitpack.io/v/LDYSummer/ToastUtils.svg)](https://jitpack.io/#LDYSummer/ToastUtils)

Toast

### 添加项目依赖
#### build.gradle
```javascript
allprojects {
	 repositories {
	  ...
		 maven { url 'https://jitpack.io' }
	 }
 }
```

#### dependency
```javascript
dependencies {
	implementation 'com.github.LDYSummer:ToastUtils:1.0.0'
}
```

### 使用 
```javascript
ToastUtils.init(this).show("提交成功",ToastUtils.TYPE_SUCCESS);
```

#### TYPE
- TYPE_SHORT
- TYPE_LONG
- TYPE_SUCCESS
- TYPE_FAILURE
- TYPE_ERROR
