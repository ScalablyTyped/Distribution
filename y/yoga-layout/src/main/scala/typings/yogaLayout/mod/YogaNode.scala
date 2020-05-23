package typings.yogaLayout.mod

import typings.yogaLayout.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YogaNode extends js.Object {
  def calculateLayout(): Unit = js.native
  def calculateLayout(width: Double): Unit = js.native
  def calculateLayout(width: Double, height: Double): Unit = js.native
  def calculateLayout(width: Double, height: Double, direction: YogaDirection): Unit = js.native
  def copyStyle(node: YogaNode): Unit = js.native
  def free(): Unit = js.native
  def freeRecursive(): Unit = js.native
  def getAlignContent(): YogaAlign = js.native
  def getAlignItems(): YogaAlign = js.native
  def getAlignSelf(): YogaAlign = js.native
  def getAspectRatio(): Double = js.native
  def getBorder(edge: YogaEdge): Double = js.native
  def getChild(index: Double): YogaNode = js.native
  def getChildCount(): Double = js.native
  def getComputedBorder(edge: YogaEdge): Double = js.native
  def getComputedBottom(): Double = js.native
  def getComputedHeight(): Double = js.native
  def getComputedLayout(): Layout = js.native
  def getComputedLeft(): Double = js.native
  def getComputedMargin(edge: YogaEdge): Double = js.native
  def getComputedPadding(edge: YogaEdge): Double = js.native
  def getComputedRight(): Double = js.native
  def getComputedTop(): Double = js.native
  def getComputedWidth(): Double = js.native
  def getDisplay(): YogaDisplay = js.native
  def getFlexBasis(): Double = js.native
  def getFlexDirection(): YogaFlexDirection = js.native
  def getFlexGrow(): Double = js.native
  def getFlexShrink(): Double = js.native
  def getFlexWrap(): YogaFlexWrap = js.native
  def getHeight(): Value = js.native
  def getJustifyContent(): YogaJustifyContent = js.native
  def getMargin(edge: YogaEdge): Value = js.native
  def getMaxHeight(): Value = js.native
  def getMaxWidth(): Value = js.native
  def getMinHeight(): Value = js.native
  def getMinWidth(): Value = js.native
  def getOverflow(): YogaOverflow = js.native
  def getPadding(edge: YogaEdge): Value = js.native
  def getParent(): YogaNode | Null = js.native
  def getPosition(edge: YogaEdge): Value = js.native
  def getPositionType(): YogaPositionType = js.native
  def getWidth(): Value = js.native
  def insertChild(child: YogaNode, index: Double): Unit = js.native
  def isDirty(): Boolean = js.native
  def markDirty(): Unit = js.native
  def removeChild(child: YogaNode): Unit = js.native
  def reset(): Unit = js.native
  def setAlignContent(alignContent: YogaAlign): Unit = js.native
  def setAlignItems(alignItems: YogaAlign): Unit = js.native
  def setAlignSelf(alignSelf: YogaAlign): Unit = js.native
  def setAspectRatio(aspectRatio: Double): Unit = js.native
  def setBorder(edge: YogaEdge, borderWidth: Double): Unit = js.native
  def setDisplay(display: YogaDisplay): Unit = js.native
  def setFlex(flex: Double): Unit = js.native
  def setFlexBasis(flexBasis: String): Unit = js.native
  def setFlexBasis(flexBasis: Double): Unit = js.native
  def setFlexBasisPercent(flexBasis: Double): Unit = js.native
  def setFlexDirection(flexDirection: YogaFlexDirection): Unit = js.native
  def setFlexGrow(flexGrow: Double): Unit = js.native
  def setFlexShrink(flexShrink: Double): Unit = js.native
  def setFlexWrap(flexWrap: YogaFlexWrap): Unit = js.native
  def setHeight(height: String): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  def setHeightAuto(): Unit = js.native
  def setHeightPercent(height: Double): Unit = js.native
  def setJustifyContent(justifyContent: YogaJustifyContent): Unit = js.native
  def setMargin(edge: YogaEdge, margin: Double): Unit = js.native
  def setMarginAuto(edge: YogaEdge): Unit = js.native
  def setMarginPercent(edge: YogaEdge, margin: Double): Unit = js.native
  def setMaxHeight(maxHeight: String): Unit = js.native
  def setMaxHeight(maxHeight: Double): Unit = js.native
  def setMaxHeightPercent(maxHeight: Double): Unit = js.native
  def setMaxWidth(maxWidth: String): Unit = js.native
  def setMaxWidth(maxWidth: Double): Unit = js.native
  def setMaxWidthPercent(maxWidth: Double): Unit = js.native
  def setMeasureFunc(
    measureFunc: js.Function4[
      /* width */ Double, 
      /* widthMeasureMode */ YogaMeasureMode, 
      /* height */ Double, 
      /* heightMeasureMode */ YogaMeasureMode, 
      Height | Null
    ]
  ): Unit = js.native
  def setMinHeight(minHeight: String): Unit = js.native
  def setMinHeight(minHeight: Double): Unit = js.native
  def setMinHeightPercent(minHeight: Double): Unit = js.native
  def setMinWidth(minWidth: String): Unit = js.native
  def setMinWidth(minWidth: Double): Unit = js.native
  def setMinWidthPercent(minWidth: Double): Unit = js.native
  def setOverflow(overflow: YogaOverflow): Unit = js.native
  def setPadding(edge: YogaEdge, padding: String): Unit = js.native
  def setPadding(edge: YogaEdge, padding: Double): Unit = js.native
  def setPaddingPercent(edge: YogaEdge, padding: Double): Unit = js.native
  def setPosition(edge: YogaEdge, position: String): Unit = js.native
  def setPosition(edge: YogaEdge, position: Double): Unit = js.native
  def setPositionPercent(edge: YogaEdge, position: Double): Unit = js.native
  def setPositionType(positionType: YogaPositionType): Unit = js.native
  def setWidth(width: String): Unit = js.native
  def setWidth(width: Double): Unit = js.native
  def setWidthAuto(): Unit = js.native
  def setWidthPercent(width: Double): Unit = js.native
  def unsetMeasureFunc(): Unit = js.native
}

