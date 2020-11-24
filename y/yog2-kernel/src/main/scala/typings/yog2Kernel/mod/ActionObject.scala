package typings.yog2Kernel.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionObject
  extends /* key */ StringDictionary[js.Any] {
  
  var copy: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var del: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var delete: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var get: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var head: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var link: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var lock: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var options: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var patch: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var post: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var propfind: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var purge: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var put: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var unlick: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var unlock: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var view: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
}
object ActionObject {
  
  @scala.inline
  def apply(): ActionObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionObject]
  }
  
  @scala.inline
  implicit class ActionObjectOps[Self <: ActionObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCopy(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("copy", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setDel(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("del", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDel: Self = this.set("del", js.undefined)
    
    @scala.inline
    def setDelete(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("delete", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setGet(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("get", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setHead(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("head", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def setLink(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("link", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setLock(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("lock", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLock: Self = this.set("lock", js.undefined)
    
    @scala.inline
    def setOptions(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("options", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPatch(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("patch", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    
    @scala.inline
    def setPost(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("post", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setPropfind(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("propfind", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePropfind: Self = this.set("propfind", js.undefined)
    
    @scala.inline
    def setPurge(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("purge", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePurge: Self = this.set("purge", js.undefined)
    
    @scala.inline
    def setPut(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("put", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePut: Self = this.set("put", js.undefined)
    
    @scala.inline
    def setUnlick(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("unlick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUnlick: Self = this.set("unlick", js.undefined)
    
    @scala.inline
    def setUnlock(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("unlock", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUnlock: Self = this.set("unlock", js.undefined)
    
    @scala.inline
    def setView(
      value: (/* req */ typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query], /* res */ typings.expressServeStaticCore.mod.Response[_, Double], /* next */ NextFunction) => js.Any
    ): Self = this.set("view", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
