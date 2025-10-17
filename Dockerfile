FROM openjdk:17-slim

COPY ./workspace /workspace
COPY ./extensions /root/.vscode-server/extensions
WORKDIR /workspace

ENV LANG=C.UTF-8
ENV LC_ALL=C.UTF-8
