# scratch_coupon

Create Google Pay,phone pay and paytm  like scratch card

<img src="https://github.com/premsingh8171/scratch_coupon/blob/master/app/src/main/res/drawable/image.gif" width="300" height="550" />



<h2>How to integrate the library in your app?</h2>
<b>Gradle dependency</b></br>

```gradle
dependencies {

	 	        implementation 'com.github.premsingh8171:scratch_coupon:1.0.0'
			
}
```

<b>Dependency</b></br>
```gradle
allprojects {
		repositories {
			
			maven { url 'https://jitpack.io' }
		}
	}
```

```xml
  <com.premsinghdaksha.scratchcoupon.ScratchCardView
                android:id="@+id/scratchCardView"
                android:layout_width="180dp"
                android:layout_height="200dp"
                android:layout_centerInParent="true"
                app:scratchDrawable="@drawable/scratch" />
```

```java
scratchCardView.setOnScratchListener(new ScratchCardView.OnScratchListener() {
            @Override
            public void onScratch(ScratchCardView scratchCard, float visiblePercent) {
                if (visiblePercent > 0.7) {
                    scratchCard.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "" + getString(R.string.rupee_20), Toast.LENGTH_SHORT).show();
                }
            }
        });
```


<h2>Created and maintained by:</h2>
<p>Er.Prem singh daksha  premsingh8171@gmail.com</p>
<p><a href="https://www.linkedin.com/in/prem-singh-daksha-82az/"> <img src="https://github.com/anitaa1990/DeviceInfo-Sample/blob/master/media/linkedin-icon.png" alt="Linkedin" style="max-width:100%;"> </a></p>
