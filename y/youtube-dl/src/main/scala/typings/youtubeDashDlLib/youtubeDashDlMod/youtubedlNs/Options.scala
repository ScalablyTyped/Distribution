package typings
package youtubeDashDlLib.youtubeDashDlMod.youtubedlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var all: js.UndefOr[scala.Boolean] = js.undefined
  var auto: js.UndefOr[scala.Boolean] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    auto: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    lang: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    __obj.asInstanceOf[Options]
  }
}

