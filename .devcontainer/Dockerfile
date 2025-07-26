# 軽量のDebianベースイメージ
FROM node:18-slim

# Git をインストール（Debian系なので apt を使う）
RUN apt-get update && apt-get install -y git \
    && npm install -g live-server \
    && apt-get clean && rm -rf /var/lib/apt/lists/*

# 作業ディレクトリを作成
WORKDIR /workspace