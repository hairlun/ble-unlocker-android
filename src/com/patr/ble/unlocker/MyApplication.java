package com.patr.ble.unlocker;

import android.app.Application;
import android.bluetooth.BluetoothGattCharacteristic;

import java.util.ArrayList;
import java.util.List;

import com.patr.ble.unlocker.bean.MService;

public class MyApplication extends Application {

    private final List<MService> services = new ArrayList<>();
    private final List<BluetoothGattCharacteristic> characteristics = new ArrayList<>();

    public List<MService> getServices() {
        return services;
    }

    public void setServices(List<MService> services) {
        this.services.clear();
        this.services.addAll(services);
    }

    public List<BluetoothGattCharacteristic> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<BluetoothGattCharacteristic> characteristics) {
        this.characteristics.clear();
        this.characteristics.addAll(characteristics);
    }

}
