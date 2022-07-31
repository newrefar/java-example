#!/usr/bin/env bash
rm com/imlayo/java/demo/lombok/*.class com/imlayo/java/demo/lombok2/*
javac com/imlayo/java/demo/lombok/Getter*
javac -processor com.imlayo.java.demo.lombok.GetterProcessor com/imlayo/java/demo/lombok/Test.java