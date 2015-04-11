package com.universer.HustWhereToEat.model; class Restaurant {/*

.class public Lcom/universer/HustWhereToEat/model/Restaurant;
.super Ljava/lang/Object;
.source "Restaurant.java"


# static fields
.field public static BIG:I

.field public static SMALL:I


# instance fields
.field private address:Ljava/lang/String;

.field private commentList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private imageUrl:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private phone:Ljava/lang/String;

.field private point:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 10
    const/4 v0, 0x0

    #v0=(Null);
    sput v0, Lcom/universer/HustWhereToEat/model/Restaurant;->BIG:I

    .line 11
    const/4 v0, 0x1

    #v0=(One);
    sput v0, Lcom/universer/HustWhereToEat/model/Restaurant;->SMALL:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .parameter "name"
    .parameter "imageUrl"
    .parameter "type"
    .parameter "address"
    .parameter "phone"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 34
    .local p6, commentList:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    #p0=(Reference);
    iput-object p1, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->name:Ljava/lang/String;

    .line 37
    iput-object p2, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->imageUrl:Ljava/lang/String;

    .line 38
    iput p3, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->type:I

    .line 39
    iput-object p4, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->address:Ljava/lang/String;

    .line 40
    iput-object p5, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->phone:Ljava/lang/String;

    .line 41
    invoke-virtual {p0, p6}, Lcom/universer/HustWhereToEat/model/Restaurant;->setCommentList(Ljava/util/List;)V

    .line 42
    return-void
.end method


# virtual methods
.method public getAddress()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->address:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getCommentList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 79
    iget-object v0, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->commentList:Ljava/util/List;

    #v0=(Reference);
    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->imageUrl:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->name:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getPhone()Ljava/lang/String;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->phone:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->point:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(Reference);
    return-object v0
.end method

.method public getType()I
    .locals 1

    .prologue
    .line 62
    iget v0, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->type:I

    #v0=(Integer);
    return v0
.end method

.method public setAddress(Ljava/lang/String;)V
    .locals 0
    .parameter "address"

    .prologue
    .line 74
    iput-object p1, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->address:Ljava/lang/String;

    .line 75
    return-void
.end method

.method public setCommentList(Ljava/util/List;)V
    .locals 0
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 84
    .local p1, commentList:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    iput-object p1, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->commentList:Ljava/util/List;

    .line 85
    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0
    .parameter "imageUrl"

    .prologue
    .line 58
    iput-object p1, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->imageUrl:Ljava/lang/String;

    .line 59
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0
    .parameter "name"

    .prologue
    .line 50
    iput-object p1, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->name:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public setPhone(Ljava/lang/String;)V
    .locals 0
    .parameter "phone"

    .prologue
    .line 94
    iput-object p1, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->phone:Ljava/lang/String;

    .line 95
    return-void
.end method

.method public setPoint(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 0
    .parameter "point"

    .prologue
    .line 28
    iput-object p1, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->point:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    .line 29
    return-void
.end method

.method public setType(I)V
    .locals 0
    .parameter "type"

    .prologue
    .line 66
    iput p1, p0, Lcom/universer/HustWhereToEat/model/Restaurant;->type:I

    .line 67
    return-void
.end method

*/}
