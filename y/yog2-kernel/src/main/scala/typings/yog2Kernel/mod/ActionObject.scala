package typings.yog2Kernel.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionObject
  extends /* key */ StringDictionary[js.Any] {
  var copy: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var del: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var delete: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var get: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var head: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var link: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var lock: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var options: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var patch: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var post: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var propfind: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var purge: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var put: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var unlick: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var unlock: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  var view: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
}

object ActionObject {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    copy: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    del: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    delete: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    get: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    head: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    link: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    lock: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    options: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    patch: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    post: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    propfind: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    purge: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    put: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    unlick: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    unlock: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null,
    view: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any], /* res */ typings.expressServeStaticCore.mod.Response[js.Any], /* next */ NextFunction) => js.Any = null
  ): ActionObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction3(copy))
    if (del != null) __obj.updateDynamic("del")(js.Any.fromFunction3(del))
    if (delete != null) __obj.updateDynamic("delete")(js.Any.fromFunction3(delete))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction3(get))
    if (head != null) __obj.updateDynamic("head")(js.Any.fromFunction3(head))
    if (link != null) __obj.updateDynamic("link")(js.Any.fromFunction3(link))
    if (lock != null) __obj.updateDynamic("lock")(js.Any.fromFunction3(lock))
    if (options != null) __obj.updateDynamic("options")(js.Any.fromFunction3(options))
    if (patch != null) __obj.updateDynamic("patch")(js.Any.fromFunction3(patch))
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction3(post))
    if (propfind != null) __obj.updateDynamic("propfind")(js.Any.fromFunction3(propfind))
    if (purge != null) __obj.updateDynamic("purge")(js.Any.fromFunction3(purge))
    if (put != null) __obj.updateDynamic("put")(js.Any.fromFunction3(put))
    if (unlick != null) __obj.updateDynamic("unlick")(js.Any.fromFunction3(unlick))
    if (unlock != null) __obj.updateDynamic("unlock")(js.Any.fromFunction3(unlock))
    if (view != null) __obj.updateDynamic("view")(js.Any.fromFunction3(view))
    __obj.asInstanceOf[ActionObject]
  }
}

