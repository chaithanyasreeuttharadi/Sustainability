<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".respiration1">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="enter"/>
    <RadioGroup
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/res"
        android:orientation="vertical">
        <RadioButton
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/twenty"
            android:text="between_20_and_30"/>
        <RadioButton
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/fourty"
            android:text="more_than_40"/>
        <RadioButton
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/fifty"
            android:text="more_than_50"/>
        <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/select"
            android:text="Click"/>
    </RadioGroup>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/average"/>
</LinearLayout>



