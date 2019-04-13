package typings
package yog2DashKernelLib.yog2DashKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionObject
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var copy: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var del: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var delete: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var get: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var head: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var link: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var lock: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var options: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var patch: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var post: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var propfind: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var purge: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var put: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var unlick: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var unlock: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
  var view: js.UndefOr[expressLib.expressMod.RequestHandler] = js.undefined
}

object ActionObject {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    copy: expressLib.expressMod.RequestHandler = null,
    del: expressLib.expressMod.RequestHandler = null,
    delete: expressLib.expressMod.RequestHandler = null,
    get: expressLib.expressMod.RequestHandler = null,
    head: expressLib.expressMod.RequestHandler = null,
    link: expressLib.expressMod.RequestHandler = null,
    lock: expressLib.expressMod.RequestHandler = null,
    options: expressLib.expressMod.RequestHandler = null,
    patch: expressLib.expressMod.RequestHandler = null,
    post: expressLib.expressMod.RequestHandler = null,
    propfind: expressLib.expressMod.RequestHandler = null,
    purge: expressLib.expressMod.RequestHandler = null,
    put: expressLib.expressMod.RequestHandler = null,
    unlick: expressLib.expressMod.RequestHandler = null,
    unlock: expressLib.expressMod.RequestHandler = null,
    view: expressLib.expressMod.RequestHandler = null
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

