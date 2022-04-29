package com.example.reselapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SubirProductosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subir_productos);
    }

    public class publicarProducto {
        private String name;
        private String description;
        private String category;
        private String brand;
        private String condition;
        private int price_eur;

        public publicarProducto(String name, String description, String category, String brand, String condition, int price_eur){
            this.name = name;
            this.description = description;
            this.category = category;
            this.brand = brand;
            this.condition = condition;
            this.price_eur = price_eur;
        }

        public int getPrice_eur() {
            return price_eur;
        }

        public String getCondition() {
            return condition;
        }

        public String getBrand() {
            return brand;
        }

        public String getCategory() {
            return category;
        }

        public String getDescription() {
            return description;
        }

        public String getName() {
            return name;
        }
    }
}