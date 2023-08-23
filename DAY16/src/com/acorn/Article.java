package com.acorn;

import java.util.Scanner;

public class Article {
    public static class Area {
        private String name;
        private String code;
        private String location;
        private String specialProduct;

        public Area(String name, String code, String location, String specialProduct) {
            this.name = name;
            this.code = code;
            this.location = location;
            this.specialProduct = specialProduct;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public String getLocation() {
            return location;
        }

        public String getSpecialProduct() {
            return specialProduct;
        }
    }

    public static class FishingBoat {
        private String boatNumber;
        private String ownerName;
        private String homePort;
        private int cargoAmount;
        private String operatingArea;

        public FishingBoat(String boatNumber, String ownerName, String homePort, int cargoAmount, String operatingArea) {
            this.boatNumber = boatNumber;
            this.ownerName = ownerName;
            this.homePort = homePort;
            this.cargoAmount = cargoAmount;
            this.operatingArea = operatingArea;
        }

        public String getBoatNumber() {
            return boatNumber;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public String getHomePort() {
            return homePort;
        }

        public int getCargoAmount() {
            return cargoAmount;
        }

        public String getOperatingArea() {
            return operatingArea;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("지역 정보 입력");
        System.out.print("지역명: ");
        String areaName = sc.nextLine();
        System.out.print("지역코드: ");
        String areaCode = sc.nextLine();
        System.out.print("위치: ");
        String location = sc.nextLine();
        System.out.print("지역특산물: ");
        String specialProduct = sc.nextLine();

        System.out.println("어선 정보 입력");
        System.out.print("배번호: ");
        String boatNumber = sc.nextLine();
        System.out.print("배주인 이름: ");
        String ownerName = sc.nextLine();
        System.out.print("상주항구: ");
        String homePort = sc.nextLine();
        System.out.print("선적량: ");
        int cargoAmount = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기 위한 추가 입력
        System.out.print("상주지역: ");
        String operatingArea = sc.nextLine();

        Area area = new Area(areaName, areaCode, location, specialProduct);
        FishingBoat fishingBoat = new FishingBoat(boatNumber, ownerName, homePort, cargoAmount, operatingArea);

        System.out.println("\n입력된 정보 출력");
        System.out.println("지역명: " + area.getName());
        System.out.println("지역코드: " + area.getCode());
        System.out.println("위치: " + area.getLocation());
        System.out.println("지역특산물: " + area.getSpecialProduct());

        System.out.println("배번호: " + fishingBoat.getBoatNumber());
        System.out.println("배주인 이름: " + fishingBoat.getOwnerName());
        System.out.println("상주항구: " + fishingBoat.getHomePort());
        System.out.println("선적량: " + fishingBoat.getCargoAmount());
        System.out.println("상주지역: " + fishingBoat.getOperatingArea());
        
        sc.close(); // 입력 스트림 닫기
    }
}