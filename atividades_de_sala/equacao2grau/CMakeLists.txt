cmake_minimum_required(VERSION 3.3)
project(equacao2grau)

set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wall -Werror")

set(SOURCE_FILES main.c)

add_executable(equacao2grau ${SOURCE_FILES})