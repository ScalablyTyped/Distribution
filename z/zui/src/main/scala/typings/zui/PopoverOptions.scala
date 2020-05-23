package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverOptions extends js.Object {
  var animation: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var content: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[Double | js.Object] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var placement: js.UndefOr[String | CallBack] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String | CallBack] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
  var viewport: js.UndefOr[String | CallBack | js.Object] = js.undefined
}

object PopoverOptions {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    container: String | Boolean = null,
    content: js.Any = null,
    delay: Double | js.Object = null,
    html: js.UndefOr[Boolean] = js.undefined,
    placement: String | CallBack = null,
    selector: String = null,
    template: String = null,
    title: String | CallBack = null,
    trigger: String = null,
    viewport: String | CallBack | js.Object = null
  ): PopoverOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.get.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverOptions]
  }
}

