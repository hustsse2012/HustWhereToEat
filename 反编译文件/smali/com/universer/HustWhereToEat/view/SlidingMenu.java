package com.universer.HustWhereToEat.view; class SlidingMenu {/*

.class public Lcom/universer/HustWhereToEat/view/SlidingMenu;
.super Landroid/widget/RelativeLayout;
.source "SlidingMenu.java"


# static fields
.field private static final VELOCITY:I = 0x32


# instance fields
.field private bgShade:Landroid/widget/RelativeLayout;

.field private canSlideLeft:Z

.field private canSlideRight:Z

.field private hasClickLeft:Z

.field private hasClickRight:Z

.field private mContext:Landroid/content/Context;

.field private mIsBeingDragged:Z

.field private mLastMotionX:F

.field private mLastMotionY:F

.field private mLeftView:Landroid/view/View;

.field private mRightView:Landroid/view/View;

.field private mScroller:Landroid/widget/Scroller;

.field private mSlidingView:Landroid/view/View;

.field private mTouchSlop:I

.field private mVelocityTracker:Landroid/view/VelocityTracker;

.field private screenHeight:I

.field private screenWidth:I

.field private tCanSlideLeft:Z

.field private tCanSlideRight:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    .line 55
    #v0=(Null);
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 48
    #p0=(Reference);
    iput-boolean v1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mIsBeingDragged:Z

    .line 49
    iput-boolean v1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideLeft:Z

    .line 50
    iput-boolean v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideRight:Z

    .line 51
    iput-boolean v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickLeft:Z

    .line 52
    iput-boolean v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickRight:Z

    .line 156
    iput-boolean v1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideLeft:Z

    .line 157
    iput-boolean v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideRight:Z

    .line 56
    invoke-direct {p0, p1}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->init(Landroid/content/Context;)V

    .line 57
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .parameter "context"
    .parameter "attrs"

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    .line 79
    #v0=(Null);
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 48
    #p0=(Reference);
    iput-boolean v1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mIsBeingDragged:Z

    .line 49
    iput-boolean v1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideLeft:Z

    .line 50
    iput-boolean v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideRight:Z

    .line 51
    iput-boolean v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickLeft:Z

    .line 52
    iput-boolean v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickRight:Z

    .line 156
    iput-boolean v1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideLeft:Z

    .line 157
    iput-boolean v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideRight:Z

    .line 80
    invoke-direct {p0, p1}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->init(Landroid/content/Context;)V

    .line 81
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyle"

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    .line 84
    #v0=(Null);
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    #p0=(Reference);
    iput-boolean v1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mIsBeingDragged:Z

    .line 49
    iput-boolean v1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideLeft:Z

    .line 50
    iput-boolean v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideRight:Z

    .line 51
    iput-boolean v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickLeft:Z

    .line 52
    iput-boolean v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickRight:Z

    .line 156
    iput-boolean v1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideLeft:Z

    .line 157
    iput-boolean v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideRight:Z

    .line 85
    invoke-direct {p0, p1}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->init(Landroid/content/Context;)V

    .line 86
    return-void
.end method

.method private getDetailViewWidth()I
    .locals 1

    .prologue
    .line 362
    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mRightView:Landroid/view/View;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 363
    const/4 v0, 0x0

    .line 365
    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mRightView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

.method private getMenuViewWidth()I
    .locals 1

    .prologue
    .line 355
    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLeftView:Landroid/view/View;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 356
    const/4 v0, 0x0

    .line 358
    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLeftView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

.method private init(Landroid/content/Context;)V
    .locals 5
    .parameter "context"

    .prologue
    .line 61
    iput-object p1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mContext:Landroid/content/Context;

    .line 62
    new-instance v3, Landroid/widget/RelativeLayout;

    #v3=(UninitRef);
    invoke-direct {v3, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    #v3=(Reference);
    iput-object v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->bgShade:Landroid/widget/RelativeLayout;

    .line 64
    new-instance v3, Landroid/widget/Scroller;

    #v3=(UninitRef);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getContext()Landroid/content/Context;

    move-result-object v4

    #v4=(Reference);
    invoke-direct {v3, v4}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    #v3=(Reference);
    iput-object v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mScroller:Landroid/widget/Scroller;

    .line 65
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v3

    #v3=(Integer);
    iput v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mTouchSlop:I

    .line 66
    check-cast p1, Landroid/app/Activity;

    .end local p1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    .line 67
    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    .line 68
    .local v2, windowManager:Landroid/view/WindowManager;
    #v2=(Reference);
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    .line 69
    .local v1, display:Landroid/view/Display;
    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/Display;->getWidth()I

    move-result v3

    #v3=(Integer);
    iput v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->screenWidth:I

    .line 71
    invoke-virtual {v1}, Landroid/view/Display;->getHeight()I

    move-result v3

    iput v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->screenHeight:I

    .line 72
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    #v0=(UninitRef);
    iget v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->screenWidth:I

    iget v4, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->screenHeight:I

    #v4=(Integer);
    invoke-direct {v0, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 73
    .local v0, bgParams:Landroid/widget/RelativeLayout$LayoutParams;
    #v0=(Reference);
    const/16 v3, 0xd

    #v3=(PosByte);
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 74
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->bgShade:Landroid/widget/RelativeLayout;

    #v3=(Reference);
    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    return-void
.end method


# virtual methods
.method public addViews(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 0
    .parameter "left"
    .parameter "center"
    .parameter "right"

    .prologue
    .line 92
    return-void
.end method

.method public computeScroll()V
    .locals 6

    .prologue
    .line 136
    iget-object v4, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mScroller:Landroid/widget/Scroller;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/widget/Scroller;->isFinished()Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_2

    .line 137
    iget-object v4, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mScroller:Landroid/widget/Scroller;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_2

    .line 138
    iget-object v4, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/view/View;->getScrollX()I

    move-result v0

    .line 139
    .local v0, oldX:I
    #v0=(Integer);
    iget-object v4, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    move-result v1

    .line 140
    .local v1, oldY:I
    #v1=(Integer);
    iget-object v4, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v4}, Landroid/widget/Scroller;->getCurrX()I

    move-result v2

    .line 141
    .local v2, x:I
    #v2=(Integer);
    iget-object v4, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v4}, Landroid/widget/Scroller;->getCurrY()I

    move-result v3

    .line 142
    .local v3, y:I
    #v3=(Integer);
    if-ne v0, v2, :cond_0

    if-eq v1, v3, :cond_1

    .line 143
    :cond_0
    iget-object v4, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    if-eqz v4, :cond_1

    .line 144
    iget-object v4, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    invoke-virtual {v4, v2, v3}, Landroid/view/View;->scrollTo(II)V

    .line 145
    if-gez v2, :cond_3

    .line 146
    iget-object v4, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->bgShade:Landroid/widget/RelativeLayout;

    add-int/lit8 v5, v2, 0x14

    #v5=(Integer);
    invoke-virtual {v4, v5, v3}, Landroid/widget/RelativeLayout;->scrollTo(II)V

    .line 151
    :cond_1
    :goto_0
    #v5=(Conflicted);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->invalidate()V

    .line 154
    .end local v0           #oldX:I
    .end local v1           #oldY:I
    .end local v2           #x:I
    .end local v3           #y:I
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 148
    .restart local v0       #oldX:I
    .restart local v1       #oldY:I
    .restart local v2       #x:I
    .restart local v3       #y:I
    :cond_3
    #v0=(Integer);v1=(Integer);v2=(Integer);v3=(Integer);v4=(Reference);v5=(Uninit);
    iget-object v4, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->bgShade:Landroid/widget/RelativeLayout;

    add-int/lit8 v5, v2, -0x14

    #v5=(Integer);
    invoke-virtual {v4, v5, v3}, Landroid/widget/RelativeLayout;->scrollTo(II)V

    goto :goto_0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12
    .parameter "ev"

    .prologue
    const/4 v11, 0x4

    #v11=(PosByte);
    const/4 v10, 0x0

    #v10=(Null);
    const/4 v9, 0x1

    #v9=(One);
    const/4 v8, 0x0

    .line 168
    #v8=(Null);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 169
    .local v0, action:I
    #v0=(Integer);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    .line 170
    .local v3, x:F
    #v3=(Float);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 171
    .local v5, y:F
    #v5=(Float);
    packed-switch v0, :pswitch_data_0

    .line 220
    :cond_0
    :goto_0
    :pswitch_0
    #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    iget-boolean v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mIsBeingDragged:Z

    #v7=(Boolean);
    return v7

    .line 173
    :pswitch_1
    #v1=(Uninit);v2=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);
    iput v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionX:F

    .line 174
    iput v5, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionY:F

    .line 175
    iput-boolean v10, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mIsBeingDragged:Z

    .line 176
    iget-boolean v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideLeft:Z

    #v7=(Boolean);
    if-eqz v7, :cond_1

    .line 177
    iget-object v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLeftView:Landroid/view/View;

    #v7=(Reference);
    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    .line 178
    iget-object v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mRightView:Landroid/view/View;

    invoke-virtual {v7, v11}, Landroid/view/View;->setVisibility(I)V

    .line 180
    :cond_1
    #v7=(Conflicted);
    iget-boolean v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideRight:Z

    #v7=(Boolean);
    if-eqz v7, :cond_0

    .line 181
    iget-object v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLeftView:Landroid/view/View;

    #v7=(Reference);
    invoke-virtual {v7, v11}, Landroid/view/View;->setVisibility(I)V

    .line 182
    iget-object v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mRightView:Landroid/view/View;

    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 187
    :pswitch_2
    #v7=(Uninit);
    iget v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionX:F

    #v7=(Integer);
    sub-float v1, v3, v7

    .line 188
    .local v1, dx:F
    #v1=(Float);
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v4

    .line 189
    .local v4, xDiff:F
    #v4=(Float);
    iget v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionY:F

    sub-float v7, v5, v7

    #v7=(Float);
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v6

    .line 190
    .local v6, yDiff:F
    #v6=(Float);
    iget v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mTouchSlop:I

    #v7=(Integer);
    int-to-float v7, v7

    #v7=(Float);
    cmpl-float v7, v4, v7

    #v7=(Byte);
    if-lez v7, :cond_0

    cmpl-float v7, v4, v6

    if-lez v7, :cond_0

    .line 191
    iget-boolean v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideLeft:Z

    #v7=(Boolean);
    if-eqz v7, :cond_3

    .line 192
    iget-object v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/view/View;->getScrollX()I

    move-result v7

    #v7=(Integer);
    int-to-float v2, v7

    .line 193
    .local v2, oldScrollX:F
    #v2=(Float);
    cmpg-float v7, v2, v8

    #v7=(Byte);
    if-gez v7, :cond_2

    .line 194
    iput-boolean v9, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mIsBeingDragged:Z

    .line 195
    iput v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionX:F

    goto :goto_0

    .line 197
    :cond_2
    cmpl-float v7, v1, v8

    if-lez v7, :cond_0

    .line 198
    iput-boolean v9, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mIsBeingDragged:Z

    .line 199
    iput v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionX:F

    goto :goto_0

    .line 203
    .end local v2           #oldScrollX:F
    :cond_3
    #v2=(Uninit);v7=(Boolean);
    iget-boolean v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideRight:Z

    if-eqz v7, :cond_0

    .line 204
    iget-object v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/view/View;->getScrollX()I

    move-result v7

    #v7=(Integer);
    int-to-float v2, v7

    .line 205
    .restart local v2       #oldScrollX:F
    #v2=(Float);
    cmpl-float v7, v2, v8

    #v7=(Byte);
    if-lez v7, :cond_4

    .line 206
    iput-boolean v9, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mIsBeingDragged:Z

    .line 207
    iput v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionX:F

    goto :goto_0

    .line 209
    :cond_4
    cmpg-float v7, v1, v8

    if-gez v7, :cond_0

    .line 210
    iput-boolean v9, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mIsBeingDragged:Z

    .line 211
    iput v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionX:F

    goto :goto_0

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 14
    .parameter "ev"

    .prologue
    .line 225
    iget-object v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v11=(Reference);
    if-nez v11, :cond_0

    .line 226
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v11

    iput-object v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 228
    :cond_0
    iget-object v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v11, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 230
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 231
    .local v0, action:I
    #v0=(Integer);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v8

    .line 232
    .local v8, x:F
    #v8=(Float);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    .line 234
    .local v10, y:F
    #v10=(Float);
    packed-switch v0, :pswitch_data_0

    .line 351
    :cond_1
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    const/4 v11, 0x1

    :goto_1
    #v11=(Boolean);
    return v11

    .line 236
    :pswitch_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v11=(Reference);v12=(Uninit);v13=(Uninit);
    iget-object v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v11}, Landroid/widget/Scroller;->isFinished()Z

    move-result v11

    #v11=(Boolean);
    if-nez v11, :cond_2

    .line 237
    iget-object v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mScroller:Landroid/widget/Scroller;

    #v11=(Reference);
    invoke-virtual {v11}, Landroid/widget/Scroller;->abortAnimation()V

    .line 239
    :cond_2
    #v11=(Conflicted);
    iput v8, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionX:F

    .line 240
    iput v10, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionY:F

    .line 241
    iget-object v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v11=(Reference);
    invoke-virtual {v11}, Landroid/view/View;->getScrollX()I

    move-result v11

    #v11=(Integer);
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getMenuViewWidth()I

    move-result v12

    #v12=(Integer);
    neg-int v12, v12

    if-ne v11, v12, :cond_3

    .line 242
    iget v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionX:F

    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getMenuViewWidth()I

    move-result v12

    int-to-float v12, v12

    #v12=(Float);
    cmpg-float v11, v11, v12

    #v11=(Byte);
    if-gez v11, :cond_3

    .line 243
    const/4 v11, 0x0

    #v11=(Null);
    goto :goto_1

    .line 246
    :cond_3
    #v11=(Integer);v12=(Integer);
    iget-object v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v11=(Reference);
    invoke-virtual {v11}, Landroid/view/View;->getScrollX()I

    move-result v11

    #v11=(Integer);
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getDetailViewWidth()I

    move-result v12

    if-ne v11, v12, :cond_1

    .line 247
    iget v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionX:F

    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getMenuViewWidth()I

    move-result v12

    int-to-float v12, v12

    #v12=(Float);
    cmpl-float v11, v11, v12

    #v11=(Byte);
    if-lez v11, :cond_1

    .line 248
    const/4 v11, 0x0

    #v11=(Null);
    goto :goto_1

    .line 253
    :pswitch_1
    #v11=(Reference);v12=(Uninit);
    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mIsBeingDragged:Z

    #v11=(Boolean);
    if-eqz v11, :cond_1

    .line 254
    iget v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionX:F

    #v11=(Integer);
    sub-float v1, v11, v8

    .line 255
    .local v1, deltaX:F
    #v1=(Float);
    iput v8, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLastMotionX:F

    .line 256
    iget-object v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v11=(Reference);
    invoke-virtual {v11}, Landroid/view/View;->getScrollX()I

    move-result v11

    #v11=(Integer);
    int-to-float v4, v11

    .line 257
    .local v4, oldScrollX:F
    #v4=(Float);
    add-float v6, v4, v1

    .line 258
    .local v6, scrollX:F
    #v6=(Float);
    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideLeft:Z

    #v11=(Boolean);
    if-eqz v11, :cond_4

    .line 259
    const/4 v11, 0x0

    #v11=(Null);
    cmpl-float v11, v6, v11

    #v11=(Byte);
    if-lez v11, :cond_4

    .line 260
    const/4 v6, 0x0

    .line 262
    :cond_4
    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideRight:Z

    #v11=(Boolean);
    if-eqz v11, :cond_5

    .line 263
    const/4 v11, 0x0

    #v11=(Null);
    cmpg-float v11, v6, v11

    #v11=(Byte);
    if-gez v11, :cond_5

    .line 264
    const/4 v6, 0x0

    .line 266
    :cond_5
    const/4 v11, 0x0

    #v11=(Null);
    cmpg-float v11, v1, v11

    #v11=(Byte);
    if-gez v11, :cond_8

    const/4 v11, 0x0

    #v11=(Null);
    cmpg-float v11, v4, v11

    #v11=(Byte);
    if-gez v11, :cond_8

    .line 267
    const/4 v3, 0x0

    .line 268
    .local v3, leftBound:F
    #v3=(Null);
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getMenuViewWidth()I

    move-result v11

    #v11=(Integer);
    neg-int v11, v11

    int-to-float v5, v11

    .line 269
    .local v5, rightBound:F
    #v5=(Float);
    const/4 v11, 0x0

    #v11=(Null);
    cmpl-float v11, v6, v11

    #v11=(Byte);
    if-lez v11, :cond_7

    .line 270
    const/4 v6, 0x0

    .line 283
    .end local v3           #leftBound:F
    .end local v5           #rightBound:F
    :cond_6
    :goto_2
    #v3=(Conflicted);v5=(Conflicted);
    iget-object v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v11=(Reference);
    if-eqz v11, :cond_1

    .line 284
    iget-object v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    float-to-int v12, v6

    .line 285
    #v12=(Integer);
    iget-object v13, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v13=(Reference);
    invoke-virtual {v13}, Landroid/view/View;->getScrollY()I

    move-result v13

    .line 284
    #v13=(Integer);
    invoke-virtual {v11, v12, v13}, Landroid/view/View;->scrollTo(II)V

    .line 286
    const/4 v11, 0x0

    #v11=(Null);
    cmpg-float v11, v6, v11

    #v11=(Byte);
    if-gez v11, :cond_a

    .line 287
    iget-object v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->bgShade:Landroid/widget/RelativeLayout;

    #v11=(Reference);
    float-to-int v12, v6

    add-int/lit8 v12, v12, 0x14

    .line 288
    iget-object v13, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v13=(Reference);
    invoke-virtual {v13}, Landroid/view/View;->getScrollY()I

    move-result v13

    .line 287
    #v13=(Integer);
    invoke-virtual {v11, v12, v13}, Landroid/widget/RelativeLayout;->scrollTo(II)V

    goto/16 :goto_0

    .line 271
    .restart local v3       #leftBound:F
    .restart local v5       #rightBound:F
    :cond_7
    #v3=(Null);v5=(Float);v11=(Byte);v12=(Uninit);v13=(Uninit);
    cmpg-float v11, v6, v5

    if-gez v11, :cond_6

    .line 272
    move v6, v5

    .line 274
    goto :goto_2

    .end local v3           #leftBound:F
    .end local v5           #rightBound:F
    :cond_8
    #v3=(Uninit);v5=(Uninit);
    const/4 v11, 0x0

    #v11=(Null);
    cmpl-float v11, v1, v11

    #v11=(Byte);
    if-lez v11, :cond_6

    const/4 v11, 0x0

    #v11=(Null);
    cmpl-float v11, v4, v11

    #v11=(Byte);
    if-lez v11, :cond_6

    .line 275
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getDetailViewWidth()I

    move-result v11

    #v11=(Integer);
    int-to-float v5, v11

    .line 276
    .restart local v5       #rightBound:F
    #v5=(Float);
    const/4 v3, 0x0

    .line 277
    .restart local v3       #leftBound:F
    #v3=(Null);
    const/4 v11, 0x0

    #v11=(Null);
    cmpg-float v11, v6, v11

    #v11=(Byte);
    if-gez v11, :cond_9

    .line 278
    const/4 v6, 0x0

    .line 279
    #v6=(Null);
    goto :goto_2

    :cond_9
    #v6=(Float);
    cmpl-float v11, v6, v5

    if-lez v11, :cond_6

    .line 280
    move v6, v5

    goto :goto_2

    .line 290
    .end local v3           #leftBound:F
    .end local v5           #rightBound:F
    :cond_a
    #v3=(Conflicted);v5=(Conflicted);v12=(Integer);v13=(Integer);
    iget-object v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->bgShade:Landroid/widget/RelativeLayout;

    #v11=(Reference);
    float-to-int v12, v6

    add-int/lit8 v12, v12, -0x14

    .line 291
    iget-object v13, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v13=(Reference);
    invoke-virtual {v13}, Landroid/view/View;->getScrollY()I

    move-result v13

    .line 290
    #v13=(Integer);
    invoke-virtual {v11, v12, v13}, Landroid/widget/RelativeLayout;->scrollTo(II)V

    goto/16 :goto_0

    .line 298
    .end local v1           #deltaX:F
    .end local v4           #oldScrollX:F
    .end local v6           #scrollX:F
    :pswitch_2
    #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v12=(Uninit);v13=(Uninit);
    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mIsBeingDragged:Z

    #v11=(Boolean);
    if-eqz v11, :cond_1

    .line 299
    iget-object v7, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 300
    .local v7, velocityTracker:Landroid/view/VelocityTracker;
    #v7=(Reference);
    const/16 v11, 0x64

    #v11=(PosByte);
    invoke-virtual {v7, v11}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 301
    invoke-virtual {v7}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v9

    .line 302
    .local v9, xVelocity:F
    #v9=(Float);
    iget-object v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v11=(Reference);
    invoke-virtual {v11}, Landroid/view/View;->getScrollX()I

    move-result v4

    .line 303
    .local v4, oldScrollX:I
    #v4=(Integer);
    const/4 v2, 0x0

    .line 304
    .local v2, dx:I
    #v2=(Null);
    if-gtz v4, :cond_b

    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideLeft:Z

    #v11=(Boolean);
    if-eqz v11, :cond_b

    .line 305
    const/high16 v11, 0x4248

    #v11=(Integer);
    cmpl-float v11, v9, v11

    #v11=(Byte);
    if-lez v11, :cond_d

    .line 306
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getMenuViewWidth()I

    move-result v11

    #v11=(Integer);
    neg-int v11, v11

    sub-int v2, v11, v4

    .line 324
    :cond_b
    :goto_3
    #v2=(Integer);v11=(Conflicted);v12=(Conflicted);
    if-ltz v4, :cond_c

    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideRight:Z

    #v11=(Boolean);
    if-eqz v11, :cond_c

    .line 325
    const/high16 v11, -0x3db8

    #v11=(Integer);
    cmpg-float v11, v9, v11

    #v11=(Byte);
    if-gez v11, :cond_10

    .line 326
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getDetailViewWidth()I

    move-result v11

    #v11=(Integer);
    sub-int v2, v11, v4

    .line 344
    :cond_c
    :goto_4
    #v11=(Conflicted);
    invoke-virtual {p0, v2}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->smoothScrollTo(I)V

    goto/16 :goto_0

    .line 307
    :cond_d
    #v2=(Null);v11=(Byte);v12=(Uninit);
    const/high16 v11, -0x3db8

    #v11=(Integer);
    cmpg-float v11, v9, v11

    #v11=(Byte);
    if-gez v11, :cond_e

    .line 308
    neg-int v2, v4

    .line 309
    #v2=(Integer);
    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickLeft:Z

    #v11=(Boolean);
    if-eqz v11, :cond_b

    .line 310
    const/4 v11, 0x0

    #v11=(Null);
    iput-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickLeft:Z

    .line 311
    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideLeft:Z

    #v11=(Boolean);
    iget-boolean v12, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideRight:Z

    #v12=(Boolean);
    invoke-virtual {p0, v11, v12}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setCanSliding(ZZ)V

    goto :goto_3

    .line 313
    :cond_e
    #v2=(Null);v11=(Byte);v12=(Uninit);
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getMenuViewWidth()I

    move-result v11

    #v11=(Integer);
    neg-int v11, v11

    div-int/lit8 v11, v11, 0x2

    if-ge v4, v11, :cond_f

    .line 314
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getMenuViewWidth()I

    move-result v11

    neg-int v11, v11

    sub-int v2, v11, v4

    .line 315
    #v2=(Integer);
    goto :goto_3

    :cond_f
    #v2=(Null);
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getMenuViewWidth()I

    move-result v11

    neg-int v11, v11

    div-int/lit8 v11, v11, 0x2

    if-lt v4, v11, :cond_b

    .line 316
    neg-int v2, v4

    .line 317
    #v2=(Integer);
    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickLeft:Z

    #v11=(Boolean);
    if-eqz v11, :cond_b

    .line 318
    const/4 v11, 0x0

    #v11=(Null);
    iput-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickLeft:Z

    .line 319
    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideLeft:Z

    #v11=(Boolean);
    iget-boolean v12, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideRight:Z

    #v12=(Boolean);
    invoke-virtual {p0, v11, v12}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setCanSliding(ZZ)V

    goto :goto_3

    .line 327
    :cond_10
    #v11=(Byte);v12=(Conflicted);
    const/high16 v11, 0x4248

    #v11=(Integer);
    cmpl-float v11, v9, v11

    #v11=(Byte);
    if-lez v11, :cond_11

    .line 328
    neg-int v2, v4

    .line 329
    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickRight:Z

    #v11=(Boolean);
    if-eqz v11, :cond_c

    .line 330
    const/4 v11, 0x0

    #v11=(Null);
    iput-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickRight:Z

    .line 331
    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideLeft:Z

    #v11=(Boolean);
    iget-boolean v12, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideRight:Z

    #v12=(Boolean);
    invoke-virtual {p0, v11, v12}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setCanSliding(ZZ)V

    goto :goto_4

    .line 333
    :cond_11
    #v11=(Byte);v12=(Conflicted);
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getDetailViewWidth()I

    move-result v11

    #v11=(Integer);
    div-int/lit8 v11, v11, 0x2

    if-le v4, v11, :cond_12

    .line 334
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getDetailViewWidth()I

    move-result v11

    sub-int v2, v11, v4

    .line 335
    goto :goto_4

    :cond_12
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getDetailViewWidth()I

    move-result v11

    div-int/lit8 v11, v11, 0x2

    if-gt v4, v11, :cond_c

    .line 336
    neg-int v2, v4

    .line 337
    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickRight:Z

    #v11=(Boolean);
    if-eqz v11, :cond_c

    .line 338
    const/4 v11, 0x0

    #v11=(Null);
    iput-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickRight:Z

    .line 339
    iget-boolean v11, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideLeft:Z

    #v11=(Boolean);
    iget-boolean v12, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideRight:Z

    #v12=(Boolean);
    invoke-virtual {p0, v11, v12}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setCanSliding(ZZ)V

    goto/16 :goto_4

    .line 234
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public scrollTo(II)V
    .locals 0
    .parameter "x"
    .parameter "y"

    .prologue
    .line 130
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->scrollTo(II)V

    .line 131
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->postInvalidate()V

    .line 132
    return-void
.end method

.method public setCanSliding(ZZ)V
    .locals 0
    .parameter "left"
    .parameter "right"

    .prologue
    .line 160
    iput-boolean p1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideLeft:Z

    .line 161
    iput-boolean p2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideRight:Z

    .line 162
    return-void
.end method

.method public setCenterView(Landroid/view/View;)V
    .locals 5
    .parameter "view"

    .prologue
    const/4 v3, -0x1

    .line 110
    #v3=(Byte);
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 113
    .local v0, aboveParams:Landroid/widget/RelativeLayout$LayoutParams;
    #v0=(Reference);
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    #v1=(UninitRef);
    iget v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->screenWidth:I

    #v3=(Integer);
    iget v4, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->screenHeight:I

    #v4=(Integer);
    invoke-direct {v1, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 114
    .local v1, bgParams:Landroid/widget/RelativeLayout$LayoutParams;
    #v1=(Reference);
    const/16 v3, 0xd

    #v3=(PosByte);
    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 116
    new-instance v2, Landroid/view/View;

    #v2=(UninitRef);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mContext:Landroid/content/Context;

    #v3=(Reference);
    invoke-direct {v2, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 117
    .local v2, bgShadeContent:Landroid/view/View;
    #v2=(Reference);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 118
    const v4, 0x7f02004f

    .line 117
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 119
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->bgShade:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, v2, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->bgShade:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v3, v1}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 123
    invoke-virtual {p0, p1, v0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 124
    iput-object p1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    .line 125
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->bringToFront()V

    .line 126
    return-void
.end method

.method public setLeftView(Landroid/view/View;)V
    .locals 3
    .parameter "view"

    .prologue
    .line 95
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    #v0=(UninitRef);
    const/4 v1, -0x2

    .line 96
    #v1=(Byte);
    const/4 v2, -0x1

    .line 95
    #v2=(Byte);
    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 97
    .local v0, behindParams:Landroid/widget/RelativeLayout$LayoutParams;
    #v0=(Reference);
    invoke-virtual {p0, p1, v0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    iput-object p1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLeftView:Landroid/view/View;

    .line 99
    return-void
.end method

.method public setRightView(Landroid/view/View;)V
    .locals 3
    .parameter "view"

    .prologue
    .line 102
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    #v0=(UninitRef);
    const/4 v1, -0x2

    .line 103
    #v1=(Byte);
    const/4 v2, -0x1

    .line 102
    #v2=(Byte);
    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 104
    .local v0, behindParams:Landroid/widget/RelativeLayout$LayoutParams;
    #v0=(Reference);
    const/16 v1, 0xb

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 105
    invoke-virtual {p0, p1, v0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 106
    iput-object p1, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mRightView:Landroid/view/View;

    .line 107
    return-void
.end method

.method public showLeftView()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    #v6=(One);
    const/4 v5, 0x0

    .line 377
    #v5=(Null);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLeftView:Landroid/view/View;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 378
    .local v0, menuWidth:I
    #v0=(Integer);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v1

    .line 379
    .local v1, oldScrollX:I
    #v1=(Integer);
    const-string v2, "SlidingMenu"

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v4, "menuWidth: "

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 380
    if-nez v1, :cond_1

    .line 381
    iget-object v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLeftView:Landroid/view/View;

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 382
    iget-object v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mRightView:Landroid/view/View;

    const/4 v3, 0x4

    #v3=(PosByte);
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 383
    neg-int v2, v0

    #v2=(Integer);
    invoke-virtual {p0, v2}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->smoothScrollTo(I)V

    .line 384
    iget-boolean v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideLeft:Z

    #v2=(Boolean);
    iput-boolean v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideLeft:Z

    .line 385
    iget-boolean v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideRight:Z

    iput-boolean v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideRight:Z

    .line 386
    iput-boolean v6, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickLeft:Z

    .line 387
    invoke-virtual {p0, v6, v5}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setCanSliding(ZZ)V

    .line 395
    :cond_0
    :goto_0
    #v2=(Integer);v3=(Conflicted);
    return-void

    .line 388
    :cond_1
    #v2=(Reference);v3=(Reference);
    neg-int v2, v0

    #v2=(Integer);
    if-ne v1, v2, :cond_0

    .line 389
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->smoothScrollTo(I)V

    .line 390
    iget-boolean v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickLeft:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 391
    iput-boolean v5, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickLeft:Z

    .line 392
    iget-boolean v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideLeft:Z

    iget-boolean v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideRight:Z

    #v3=(Boolean);
    invoke-virtual {p0, v2, v3}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setCanSliding(ZZ)V

    goto :goto_0
.end method

.method public showRightView()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    #v5=(One);
    const/4 v4, 0x0

    .line 398
    #v4=(Null);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mRightView:Landroid/view/View;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 399
    .local v0, menuWidth:I
    #v0=(Integer);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v1

    .line 400
    .local v1, oldScrollX:I
    #v1=(Integer);
    if-nez v1, :cond_1

    .line 401
    iget-object v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mLeftView:Landroid/view/View;

    const/4 v3, 0x4

    #v3=(PosByte);
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 402
    iget-object v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mRightView:Landroid/view/View;

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 403
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->smoothScrollTo(I)V

    .line 404
    iget-boolean v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideLeft:Z

    #v2=(Boolean);
    iput-boolean v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideLeft:Z

    .line 405
    iget-boolean v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->canSlideRight:Z

    iput-boolean v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideRight:Z

    .line 406
    iput-boolean v5, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickRight:Z

    .line 407
    invoke-virtual {p0, v4, v5}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setCanSliding(ZZ)V

    .line 415
    :cond_0
    :goto_0
    #v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 408
    :cond_1
    #v2=(Reference);v3=(Uninit);
    if-ne v1, v0, :cond_0

    .line 409
    neg-int v2, v0

    #v2=(Integer);
    invoke-virtual {p0, v2}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->smoothScrollTo(I)V

    .line 410
    iget-boolean v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickRight:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 411
    iput-boolean v4, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->hasClickRight:Z

    .line 412
    iget-boolean v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideLeft:Z

    iget-boolean v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->tCanSlideRight:Z

    #v3=(Boolean);
    invoke-virtual {p0, v2, v3}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setCanSliding(ZZ)V

    goto :goto_0
.end method

.method smoothScrollTo(I)V
    .locals 6
    .parameter "dx"

    .prologue
    .line 369
    const/16 v5, 0x1f4

    .line 370
    .local v5, duration:I
    #v5=(PosShort);
    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v1

    .line 371
    .local v1, oldScrollX:I
    #v1=(Integer);
    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mScroller:Landroid/widget/Scroller;

    iget-object v2, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/view/View;->getScrollY()I

    move-result v2

    .line 372
    #v2=(Integer);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/SlidingMenu;->mSlidingView:Landroid/view/View;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getScrollY()I

    move-result v4

    #v4=(Integer);
    move v3, p1

    .line 371
    #v3=(Integer);
    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 373
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->invalidate()V

    .line 374
    return-void
.end method

*/}
