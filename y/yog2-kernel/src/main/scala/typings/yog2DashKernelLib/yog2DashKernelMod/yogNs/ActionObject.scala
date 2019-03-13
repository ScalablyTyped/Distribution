package typings
package yog2DashKernelLib.yog2DashKernelMod.yogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionObject
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var copy: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var del: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var delete: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var get: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var head: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var link: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var lock: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var options: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var patch: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var post: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var propfind: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var purge: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var put: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var unlick: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var unlock: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
  var view: js.UndefOr[expressLib.expressMod.eNs.RequestHandler] = js.undefined
}

object ActionObject {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    copy: expressLib.expressMod.eNs.RequestHandler = null,
    del: expressLib.expressMod.eNs.RequestHandler = null,
    delete: expressLib.expressMod.eNs.RequestHandler = null,
    get: expressLib.expressMod.eNs.RequestHandler = null,
    head: expressLib.expressMod.eNs.RequestHandler = null,
    link: expressLib.expressMod.eNs.RequestHandler = null,
    lock: expressLib.expressMod.eNs.RequestHandler = null,
    options: expressLib.expressMod.eNs.RequestHandler = null,
    patch: expressLib.expressMod.eNs.RequestHandler = null,
    post: expressLib.expressMod.eNs.RequestHandler = null,
    propfind: expressLib.expressMod.eNs.RequestHandler = null,
    purge: expressLib.expressMod.eNs.RequestHandler = null,
    put: expressLib.expressMod.eNs.RequestHandler = null,
    unlick: expressLib.expressMod.eNs.RequestHandler = null,
    unlock: expressLib.expressMod.eNs.RequestHandler = null,
    view: expressLib.expressMod.eNs.RequestHandler = null
  ): ActionObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (del != null) __obj.updateDynamic("del")(del)
    if (delete != null) __obj.updateDynamic("delete")(delete)
    if (get != null) __obj.updateDynamic("get")(get)
    if (head != null) __obj.updateDynamic("head")(head)
    if (link != null) __obj.updateDynamic("link")(link)
    if (lock != null) __obj.updateDynamic("lock")(lock)
    if (options != null) __obj.updateDynamic("options")(options)
    if (patch != null) __obj.updateDynamic("patch")(patch)
    if (post != null) __obj.updateDynamic("post")(post)
    if (propfind != null) __obj.updateDynamic("propfind")(propfind)
    if (purge != null) __obj.updateDynamic("purge")(purge)
    if (put != null) __obj.updateDynamic("put")(put)
    if (unlick != null) __obj.updateDynamic("unlick")(unlick)
    if (unlock != null) __obj.updateDynamic("unlock")(unlock)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[ActionObject]
  }
}

