package android.support.v4.view; class GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr1 {/*

.class Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr1;
.super Ljava/lang/Object;
.source "GestureDetectorCompat.java"

# interfaces
.implements Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/GestureDetectorCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "GestureDetectorCompatImplJellybeanMr1"
.end annotation


# instance fields
.field private final mDetector:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
    .locals 1
    .parameter "context"
    .parameter "listener"
    .parameter "handler"

    .prologue
    .line 452
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 453
    #p0=(Reference);
    new-instance v0, Landroid/view/GestureDetector;

    #v0=(UninitRef);
    invoke-direct {v0, p1, p2, p3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr1;->mDetector:Landroid/view/GestureDetector;

    .line 454
    return-void
.end method


# virtual methods
.method public isLongpressEnabled()Z
    .locals 1

    .prologue
    .line 458
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr1;->mDetector:Landroid/view/GestureDetector;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/GestureDetector;->isLongpressEnabled()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .parameter "ev"

    .prologue
    .line 463
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr1;->mDetector:Landroid/view/GestureDetector;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public setIsLongpressEnabled(Z)V
    .locals 1
    .parameter "enabled"

    .prologue
    .line 468
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr1;->mDetector:Landroid/view/GestureDetector;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    .line 469
    return-void
.end method

.method public setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
    .locals 1
    .parameter "listener"

    .prologue
    .line 473
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr1;->mDetector:Landroid/view/GestureDetector;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 474
    return-void
.end method

*/}
