public class adepter_method_pattern {

    // Target Interface
    interface Speaker {
        void playMusic();
    }

    // Adaptee (Existing Class)
    static class BluetoothSpeaker {

        public void connectBluetooth() {
            System.out.println("Playing music through Bluetooth Speaker.");
        }
    }

    // Adapter
    static class SpeakerAdapter implements Speaker {

        private BluetoothSpeaker bluetoothSpeaker;

        public SpeakerAdapter(BluetoothSpeaker bluetoothSpeaker) {
            this.bluetoothSpeaker = bluetoothSpeaker;
        }

        @Override
        public void playMusic() {
            bluetoothSpeaker.connectBluetooth();
        }
    }

    public static void main(String[] args) {

        BluetoothSpeaker bluetoothSpeaker = new BluetoothSpeaker();

        Speaker speaker = new SpeakerAdapter(bluetoothSpeaker);

        speaker.playMusic();
    }
}

/*
Adapter Pattern
Simple Definition

Adapter Pattern is a structural design pattern that allows two incompatible interfaces to work
 together by acting as a bridge between them.

Easy to Remember

"Adapter connects two incompatible objects so they can communicate."

Why do we need Adapter Pattern?

Suppose your mobile charger has a USB-C cable, but your laptop only has a USB-A port.

They cannot connect directly.

So you use an Adapter.

USB-C Cable
      ↓
USB Adapter
      ↓
USB-A Port

Now both devices work together.

This is exactly what the Adapter Pattern does in software.

Real-Life Example
🔌 Mobile Charger Adapter

Imagine you buy an iPhone charger in the USA.

Charger Plug → USA Plug
Your wall socket → Indian Socket

They are incompatible.

You use a Travel Adapter.

USA Charger
      ↓
Travel Adapter
      ↓
Indian Socket

The adapter makes both compatible.

Another Real-Life Example

🎧 3.5mm Headphone → USB-C Phone

Headphone
      ↓
Adapter
      ↓
Phone

Without the adapter, they cannot communicate.

Java Example

Suppose we already have an old speaker.

The speaker understands AUX cable.

But our phone only gives Bluetooth.

We create an Adapter.
*/