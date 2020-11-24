package typings.zeditUpf.mod

import typings.xelib.mod.GameMode
import typings.zeditUpf.anon.Controller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Patcher[S /* <: js.Object */, L /* <: js.Object */] extends js.Object {
  
  /**
    * This function gets called when your patcher is executed.
    *
    * @param patchFile Handle to patch file
    * @param settings @see defaultSettings
    * @param locals Store values to refer to them later in the patching process.
    */
  var execute: (js.Function1[/* args */ ExectuteCTX[S, L], Executor[S, L]]) | (Executor[S, L]) = js.native
  
  /**
    * Array of the game modes your patcher works with
    */
  var gameModes: js.Array[GameMode] = js.native
  
  /**
    * You can program strict exclusions here.
    * These exclusions cannot be overridden by the user.
    * This function can be removed if you don't want to hard-exclude any files.
    */
  var getFilesToPatch: js.UndefOr[js.Function1[/* filenames */ js.Array[String], js.Array[String]]] = js.native
  
  /**
    * Your patcher module information.
    * You should use the `info` variable as the value here.
    */
  var info: ModuleInfo = js.native
  
  /**
    * Optional array of required filenames.
    * Can omit if empty.
    *
    * @default []
    */
  var requiredFiles: js.UndefOr[js.Function0[js.Array[String]] | js.Array[String]] = js.native
  
  var settings: Controller[S] = js.native
}
object Patcher {
  
  @scala.inline
  def apply[S /* <: js.Object */, L /* <: js.Object */](
    execute: (js.Function1[/* args */ ExectuteCTX[S, L], Executor[S, L]]) | (Executor[S, L]),
    gameModes: js.Array[GameMode],
    info: ModuleInfo,
    settings: Controller[S]
  ): Patcher[S, L] = {
    val __obj = js.Dynamic.literal(execute = execute.asInstanceOf[js.Any], gameModes = gameModes.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patcher[S, L]]
  }
  
  @scala.inline
  implicit class PatcherOps[Self <: Patcher[_, _], S /* <: js.Object */, L /* <: js.Object */] (val x: Self with (Patcher[S, L])) extends AnyVal {
    
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
    def setExecuteFunction1(value: /* args */ ExectuteCTX[S, L] => Executor[S, L]): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecute(value: (js.Function1[/* args */ ExectuteCTX[S, L], Executor[S, L]]) | (Executor[S, L])): Self = this.set("execute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameModesVarargs(value: GameMode*): Self = this.set("gameModes", js.Array(value :_*))
    
    @scala.inline
    def setGameModes(value: js.Array[GameMode]): Self = this.set("gameModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: ModuleInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: Controller[S]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFilesToPatch(value: /* filenames */ js.Array[String] => js.Array[String]): Self = this.set("getFilesToPatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetFilesToPatch: Self = this.set("getFilesToPatch", js.undefined)
    
    @scala.inline
    def setRequiredFilesVarargs(value: String*): Self = this.set("requiredFiles", js.Array(value :_*))
    
    @scala.inline
    def setRequiredFilesFunction0(value: () => js.Array[String]): Self = this.set("requiredFiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequiredFiles(value: js.Function0[js.Array[String]] | js.Array[String]): Self = this.set("requiredFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredFiles: Self = this.set("requiredFiles", js.undefined)
  }
}
