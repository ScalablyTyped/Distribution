package typings.zingchart.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait data extends js.Object {
  var globals: js.UndefOr[typings.zingchart.mod.globals] = js.undefined
  var graphset: js.UndefOr[js.Array[typings.zingchart.mod.graphset]] = js.undefined
  var gui: js.UndefOr[typings.zingchart.mod.gui] = js.undefined
  var history: js.UndefOr[typings.zingchart.mod.history] = js.undefined
  var refresh: js.UndefOr[typings.zingchart.mod.refresh] = js.undefined
}

object data {
  @scala.inline
  def apply(
    globals: globals = null,
    graphset: js.Array[graphset] = null,
    gui: gui = null,
    history: history = null,
    refresh: refresh = null
  ): data = {
    val __obj = js.Dynamic.literal()
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (graphset != null) __obj.updateDynamic("graphset")(graphset.asInstanceOf[js.Any])
    if (gui != null) __obj.updateDynamic("gui")(gui.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[data]
  }
}

