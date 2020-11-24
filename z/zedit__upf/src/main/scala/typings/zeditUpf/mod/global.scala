package typings.zeditUpf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UPF modules have these variables exposed globally:
  *
  * registerPatcher, fh, info, patcherPath, patcherUrl, xelib
  * @see {@link https://z-edit.github.io#/docs?t=Modules%2FPatcher_Modules}
  */
@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * @see FileHelpers
    */
  val fh: FileHelpers = js.native
  
  /**
    * Object containing information about your module.
    * Basically just your module.json.
    */
  val info: ModuleInfo = js.native
  
  /**
    * The zEdit angular application.
    *
    * @see {@link https://docs.angularjs.org/api/ng/type/angular.Module}
    * @see {@link https://docs.angularjs.org/guide/di}
    */
  val ngapp: js.Object = js.native
  
  /**
    * Absolute path for the folder where your patcher module is installed on the user's machine.
    * Should be prepended to paths when loading/saving files.
    */
  val patcherPath: String = js.native
  
  /**
    * `file://` URL for the folder where your patcher module is installed on the user's machine.
    * Should be prepended to any HTML template/resource URLs.
    */
  val patcherUrl: String = js.native
  
  /**
    * @deprecated The Patcher used in this call contains deprecated option types
    * @see LegacyPatcher
    */
  // tslint:disable-next-line no-unnecessary-generics
  /**
    * Function for registering a patcher with UPF
    *
    * Generics are needed for inference within Patcher interface to work
    */
  // tslint:disable-next-line no-unnecessary-generics unified-signatures
  def registerPatcher[L, S](patcher: (LegacyPatcher[S, L]) | (Patcher[S, L])): Unit = js.native
  
  /**
    * xelib wrapper instance exposed to zEdit modules
    *
    * @see XELib
    */
  val xelib: XELibModule = js.native
}
