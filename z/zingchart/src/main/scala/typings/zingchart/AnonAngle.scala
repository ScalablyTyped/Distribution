package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAngle extends js.Object {
  /**
    * Sets the view angle when using the isometric 3D engine. Value can be between 0 and 90, with the default viewing angle being 45°. 5
    *  | 10 | ...
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Z depth for a 3D chart type displayed in either isometric or true 3D. 5 | 10 | ...
    */
  var depth: js.UndefOr[Double] = js.undefined
  /**
    * Sets whether the chart uses a true 3D engine or an isometric view. Disabling true3d forces an isometric view. true | false | 1 | 0
    */
  var true3d: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the X rotation viewing angle for the true 3D view. Viewing angle may vary depending on the chart type. 5 | 10 | ...
    */
  var `x-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Y rotation viewing angle for the true 3D view. Viewing angle may vary depending on the chart type. 5 | 10 | ...
    */
  var `y-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Z rotation viewing angle for the true 3D view. Viewing angle may vary depending on the chart type. 5 | 10 | ...
    */
  var `z-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the perspective zoom for the true 3D view. The default zoom level is 1.0. Note that a leading 0 is required before the decima
    * l for values less than 1.0. 1 | 1.5 | 0.8 | ...
    */
  var zoom: js.UndefOr[Double] = js.undefined
}

object AnonAngle {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    depth: Int | Double = null,
    true3d: js.UndefOr[Boolean] = js.undefined,
    `x-angle`: Int | Double = null,
    `y-angle`: Int | Double = null,
    `z-angle`: Int | Double = null,
    zoom: Int | Double = null
  ): AnonAngle = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(true3d)) __obj.updateDynamic("true3d")(true3d.asInstanceOf[js.Any])
    if (`x-angle` != null) __obj.updateDynamic("x-angle")(`x-angle`.asInstanceOf[js.Any])
    if (`y-angle` != null) __obj.updateDynamic("y-angle")(`y-angle`.asInstanceOf[js.Any])
    if (`z-angle` != null) __obj.updateDynamic("z-angle")(`z-angle`.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAngle]
  }
}

