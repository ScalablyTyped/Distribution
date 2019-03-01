package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var delay: js.UndefOr[scala.Double | js.Object] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var placement: js.UndefOr[java.lang.String | CallBack] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String | CallBack] = js.undefined
  var trigger: js.UndefOr[java.lang.String] = js.undefined
  var viewport: js.UndefOr[java.lang.String | CallBack | js.Object] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String | scala.Boolean = null,
    delay: scala.Double | js.Object = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    placement: java.lang.String | CallBack = null,
    selector: java.lang.String = null,
    template: java.lang.String = null,
    title: java.lang.String | CallBack = null,
    trigger: java.lang.String = null,
    viewport: java.lang.String | CallBack | js.Object = null
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (template != null) __obj.updateDynamic("template")(template)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

