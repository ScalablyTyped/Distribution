package typings.zeditUpf

import typings.xelib.mod.FileHandle
import typings.xelib.mod.RecordHandle
import typings.zeditUpf.mod.Executor
import typings.zeditUpf.mod.Helpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Controller[S /* <: js.Object */] extends StObject {
    
    /**
      * controller function for your patcher's settings tab.
      * This is where you put any extra data binding/functions
      * that you need to access through angular on the settings tab.
      *
      * @todo what is $scope?
      */
    var controller: js.UndefOr[js.Function1[/* $scope */ js.Any, Unit]] = js.native
    
    /**
      * Default settings for your patcher.
      */
    var defaultSettings: PatchFileName with S = js.native
    
    /**
      * If you set hide to true the settings tab will not be displayed
      *
      * @default false
      */
    var hide: js.UndefOr[Boolean] = js.native
    
    /**
      * The label is what gets displayed as the settings tab's label
      */
    var label: String = js.native
    
    /**
      * URL to the HTML template to use for the settings tab.
      * You'll want to use the `patcherUrl` global in this URL.
      *
      * @example `${patcherUrl}/partials/settings.html`
      */
    var templateUrl: String = js.native
  }
  object Controller {
    
    @scala.inline
    def apply[S /* <: js.Object */](defaultSettings: PatchFileName with S, label: String, templateUrl: String): Controller[S] = {
      val __obj = js.Dynamic.literal(defaultSettings = defaultSettings.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Controller[S]]
    }
    
    @scala.inline
    implicit class ControllerMutableBuilder[Self <: Controller[_], S /* <: js.Object */] (val x: Self with Controller[S]) extends AnyVal {
      
      @scala.inline
      def setController(value: /* $scope */ js.Any => Unit): Self = StObject.set(x, "controller", js.Any.fromFunction1(value))
      
      @scala.inline
      def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      @scala.inline
      def setDefaultSettings(value: PatchFileName with S): Self = StObject.set(x, "defaultSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Execute[S, L] extends StObject {
    
    /**
      * @deprecated Use function version
      * @see Patcher.execute
      */
    var execute: Executor[S, L] = js.native
  }
  object Execute {
    
    @scala.inline
    def apply[S, L](execute: Executor[S, L]): Execute[S, L] = {
      val __obj = js.Dynamic.literal(execute = execute.asInstanceOf[js.Any])
      __obj.asInstanceOf[Execute[S, L]]
    }
    
    @scala.inline
    implicit class ExecuteMutableBuilder[Self <: Execute[_, _], S, L] (val x: Self with (Execute[S, L])) extends AnyVal {
      
      @scala.inline
      def setExecute(value: Executor[S, L]): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Filter extends StObject {
    
    /**
      * Filter function. Called for each loaded record.
      * Return false to skip patching a record.
      */
    var filter: js.UndefOr[js.Function1[/* record */ RecordHandle, Boolean]] = js.native
    
    /**
      * Pass true to include override records.
      *
      * @default false
      */
    var overrides: js.UndefOr[Boolean] = js.native
    
    /**
      * Record signature to load.
      * You can view record signatures by top level group names
      * on the tree view and in record headers.
      */
    var signature: String = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(signature: String): Filter = {
      val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: /* record */ RecordHandle => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setOverrides(value: Boolean): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Load extends StObject {
    
    /**
      * Loaded records which pass filter will be copied to the patch plugin,
      * and then passed to the patch function.
      */
    var load: Filter = js.native
  }
  object Load {
    
    @scala.inline
    def apply(load: Filter): Load = {
      val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any])
      __obj.asInstanceOf[Load]
    }
    
    @scala.inline
    implicit class LoadMutableBuilder[Self <: Load] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoad(value: Filter): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Patch[S, L] extends StObject {
    
    /**
      * Called for each record copied to the patch plugin.
      * This is the step where you set values on the record.
      */
    var patch: js.UndefOr[
        js.Function4[/* record */ RecordHandle, /* helpers */ Helpers, /* settings */ S, /* locals */ L, Unit]
      ] = js.native
  }
  object Patch {
    
    @scala.inline
    def apply[S, L](): Patch[S, L] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Patch[S, L]]
    }
    
    @scala.inline
    implicit class PatchMutableBuilder[Self <: Patch[_, _], S, L] (val x: Self with (Patch[S, L])) extends AnyVal {
      
      @scala.inline
      def setPatch(
        value: (/* record */ RecordHandle, /* helpers */ Helpers, /* settings */ S, /* locals */ L) => Unit
      ): Self = StObject.set(x, "patch", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    }
  }
  
  @js.native
  trait PatchFileName extends StObject {
    
    /**
      * Use the patchFileName setting if you want to use a unique patch file
      * for your patcher instead of the default zPatch.esp plugin file.
      * (using zPatch.esp is recommended)
      *
      * @default zPatch.esp
      */
    var patchFileName: js.UndefOr[String] = js.native
  }
  object PatchFileName {
    
    @scala.inline
    def apply(): PatchFileName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchFileName]
    }
    
    @scala.inline
    implicit class PatchFileNameMutableBuilder[Self <: PatchFileName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPatchFileName(value: String): Self = StObject.set(x, "patchFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchFileNameUndefined: Self = StObject.set(x, "patchFileName", js.undefined)
    }
  }
  
  @js.native
  trait Records[S, L] extends StObject {
    
    /**
      * A function which can be used instead of load.
      * The records function allows you to return a custom array of records to patch.
      */
    def records(filesToPatch: js.Array[FileHandle], helpers: Helpers, settings: S, locals: L): js.Array[RecordHandle] = js.native
  }
  object Records {
    
    @scala.inline
    def apply[S, L](records: (js.Array[FileHandle], Helpers, S, L) => js.Array[RecordHandle]): Records[S, L] = {
      val __obj = js.Dynamic.literal(records = js.Any.fromFunction4(records))
      __obj.asInstanceOf[Records[S, L]]
    }
    
    @scala.inline
    implicit class RecordsMutableBuilder[Self <: Records[_, _], S, L] (val x: Self with (Records[S, L])) extends AnyVal {
      
      @scala.inline
      def setRecords(value: (js.Array[FileHandle], Helpers, S, L) => js.Array[RecordHandle]): Self = StObject.set(x, "records", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait RequiredFiles extends StObject {
    
    /**
      * @deprecated Use function version
      * @see Patcher.requiredFiles
      */
    var requiredFiles: js.Array[String] = js.native
  }
  object RequiredFiles {
    
    @scala.inline
    def apply(requiredFiles: js.Array[String]): RequiredFiles = {
      val __obj = js.Dynamic.literal(requiredFiles = requiredFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredFiles]
    }
    
    @scala.inline
    implicit class RequiredFilesMutableBuilder[Self <: RequiredFiles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequiredFiles(value: js.Array[String]): Self = StObject.set(x, "requiredFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredFilesVarargs(value: String*): Self = StObject.set(x, "requiredFiles", js.Array(value :_*))
    }
  }
}
