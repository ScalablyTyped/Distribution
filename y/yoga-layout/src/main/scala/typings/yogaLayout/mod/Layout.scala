package typings.yogaLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  val bottom: Double = js.native
  val height: Double = js.native
  val left: Double = js.native
  val right: Double = js.native
  val top: Double = js.native
  val width: Double = js.native
  def fromJs(
    expose: js.Function6[
      /* left */ Double, 
      /* right */ Double, 
      /* top */ Double, 
      /* bottom */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      _
    ]
  ): Unit = js.native
}

object Layout {
  @scala.inline
  def apply(
    bottom: Double,
    fromJs: js.Function6[
      /* left */ Double, 
      /* right */ Double, 
      /* top */ Double, 
      /* bottom */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      _
    ] => Unit,
    height: Double,
    left: Double,
    right: Double,
    top: Double,
    width: Double
  ): Layout = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], fromJs = js.Any.fromFunction1(fromJs), height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromJs(
      value: js.Function6[
          /* left */ Double, 
          /* right */ Double, 
          /* top */ Double, 
          /* bottom */ Double, 
          /* width */ Double, 
          /* height */ Double, 
          _
        ] => Unit
    ): Self = this.set("fromJs", js.Any.fromFunction1(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

