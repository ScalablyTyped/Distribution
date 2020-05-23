package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Async extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * TODO: description of async attribute true | false | 1 | 0
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the blur radius of the heatmap regions. 10 | 20 | ...
    */
  var blur: js.UndefOr[Double] = js.undefined
  /**
    * Sets the type of blur shape. "circle" | "square" | ...
    */
  var `brush-typebrushType`: js.UndefOr[String] = js.undefined
  /**
    * Sets the blur shapes to composite or not. true | false | 1 | 0
    */
  var composite: js.UndefOr[Boolean] = js.undefined
  var graph: js.UndefOr[KeyscalekeyScale] = js.undefined
  /**
    * Sets the size of the object/shape. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets whether or not the data is sorted. true | false | 1 | 0
    */
  var `sort-datasortData`: js.UndefOr[Boolean] = js.undefined
  var tooltip: js.UndefOr[Backgroundfit] = js.undefined
}

object Async {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    async: js.UndefOr[Boolean] = js.undefined,
    blur: js.UndefOr[Double] = js.undefined,
    `brush-typebrushType`: String = null,
    composite: js.UndefOr[Boolean] = js.undefined,
    graph: KeyscalekeyScale = null,
    size: js.Any = null,
    `sort-datasortData`: js.UndefOr[Boolean] = js.undefined,
    tooltip: Backgroundfit = null
  ): Async = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blur)) __obj.updateDynamic("blur")(blur.get.asInstanceOf[js.Any])
    if (`brush-typebrushType` != null) __obj.updateDynamic("brush-typebrushType")(`brush-typebrushType`.asInstanceOf[js.Any])
    if (!js.isUndefined(composite)) __obj.updateDynamic("composite")(composite.get.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(`sort-datasortData`)) __obj.updateDynamic("sort-datasortData")(`sort-datasortData`.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
}

