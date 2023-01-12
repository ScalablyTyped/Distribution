package typings.zeditUpf

import typings.xelib.mod.FileHandle
import typings.xelib.mod.RecordHandle
import typings.zeditUpf.mod.Executor
import typings.zeditUpf.mod.Helpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Controller[S /* <: js.Object */] extends StObject {
    
    /**
      * controller function for your patcher's settings tab.
      * This is where you put any extra data binding/functions
      * that you need to access through angular on the settings tab.
      *
      * @todo what is $scope?
      */
    var controller: js.UndefOr[js.Function1[/* $scope */ Any, Unit]] = js.undefined
    
    /**
      * Default settings for your patcher.
      */
    var defaultSettings: PatchFileName & S
    
    /**
      * If you set hide to true the settings tab will not be displayed
      *
      * @default false
      */
    var hide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The label is what gets displayed as the settings tab's label
      */
    var label: String
    
    /**
      * URL to the HTML template to use for the settings tab.
      * You'll want to use the `patcherUrl` global in this URL.
      *
      * @example `${patcherUrl}/partials/settings.html`
      */
    var templateUrl: String
  }
  object Controller {
    
    inline def apply[S /* <: js.Object */](defaultSettings: PatchFileName & S, label: String, templateUrl: String): Controller[S] = {
      val __obj = js.Dynamic.literal(defaultSettings = defaultSettings.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Controller[S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Controller[?], S /* <: js.Object */] (val x: Self & Controller[S]) extends AnyVal {
      
      inline def setController(value: /* $scope */ Any => Unit): Self = StObject.set(x, "controller", js.Any.fromFunction1(value))
      
      inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      inline def setDefaultSettings(value: PatchFileName & S): Self = StObject.set(x, "defaultSettings", value.asInstanceOf[js.Any])
      
      inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Execute[S /* <: js.Object */, L /* <: js.Object */] extends StObject {
    
    /**
      * @deprecated Use function version
      * @see Patcher.execute
      */
    var execute: Executor[S, L]
  }
  object Execute {
    
    inline def apply[S /* <: js.Object */, L /* <: js.Object */](execute: Executor[S, L]): Execute[S, L] = {
      val __obj = js.Dynamic.literal(execute = execute.asInstanceOf[js.Any])
      __obj.asInstanceOf[Execute[S, L]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Execute[?, ?], S /* <: js.Object */, L /* <: js.Object */] (val x: Self & (Execute[S, L])) extends AnyVal {
      
      inline def setExecute(value: Executor[S, L]): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    }
  }
  
  trait Filter extends StObject {
    
    /**
      * Filter function. Called for each loaded record.
      * Return false to skip patching a record.
      */
    var filter: js.UndefOr[js.Function1[/* record */ RecordHandle, Boolean]] = js.undefined
    
    /**
      * Pass true to include override records.
      *
      * @default false
      */
    var overrides: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Record signature to load.
      * You can view record signatures by top level group names
      * on the tree view and in record headers.
      */
    var signature: String
  }
  object Filter {
    
    inline def apply(signature: String): Filter = {
      val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: /* record */ RecordHandle => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setOverrides(value: Boolean): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait Load extends StObject {
    
    /**
      * Loaded records which pass filter will be copied to the patch plugin,
      * and then passed to the patch function.
      */
    var load: Filter
  }
  object Load {
    
    inline def apply(load: Filter): Load = {
      val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any])
      __obj.asInstanceOf[Load]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Load] (val x: Self) extends AnyVal {
      
      inline def setLoad(value: Filter): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    }
  }
  
  trait Patch[S, L] extends StObject {
    
    /**
      * Called for each record copied to the patch plugin.
      * This is the step where you set values on the record.
      */
    var patch: js.UndefOr[
        js.Function4[/* record */ RecordHandle, /* helpers */ Helpers, /* settings */ S, /* locals */ L, Unit]
      ] = js.undefined
  }
  object Patch {
    
    inline def apply[S, L](): Patch[S, L] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Patch[S, L]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Patch[?, ?], S, L] (val x: Self & (Patch[S, L])) extends AnyVal {
      
      inline def setPatch(
        value: (/* record */ RecordHandle, /* helpers */ Helpers, /* settings */ S, /* locals */ L) => Unit
      ): Self = StObject.set(x, "patch", js.Any.fromFunction4(value))
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    }
  }
  
  trait PatchFileName extends StObject {
    
    /**
      * Use the patchFileName setting if you want to use a unique patch file
      * for your patcher instead of the default zPatch.esp plugin file.
      * (using zPatch.esp is recommended)
      *
      * @default zPatch.esp
      */
    var patchFileName: js.UndefOr[String] = js.undefined
  }
  object PatchFileName {
    
    inline def apply(): PatchFileName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchFileName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PatchFileName] (val x: Self) extends AnyVal {
      
      inline def setPatchFileName(value: String): Self = StObject.set(x, "patchFileName", value.asInstanceOf[js.Any])
      
      inline def setPatchFileNameUndefined: Self = StObject.set(x, "patchFileName", js.undefined)
    }
  }
  
  trait Records[S, L] extends StObject {
    
    /**
      * A function which can be used instead of load.
      * The records function allows you to return a custom array of records to patch.
      */
    def records(filesToPatch: js.Array[FileHandle], helpers: Helpers, settings: S, locals: L): js.Array[RecordHandle]
  }
  object Records {
    
    inline def apply[S, L](records: (js.Array[FileHandle], Helpers, S, L) => js.Array[RecordHandle]): Records[S, L] = {
      val __obj = js.Dynamic.literal(records = js.Any.fromFunction4(records))
      __obj.asInstanceOf[Records[S, L]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Records[?, ?], S, L] (val x: Self & (Records[S, L])) extends AnyVal {
      
      inline def setRecords(value: (js.Array[FileHandle], Helpers, S, L) => js.Array[RecordHandle]): Self = StObject.set(x, "records", js.Any.fromFunction4(value))
    }
  }
  
  trait RequiredFiles extends StObject {
    
    /**
      * @deprecated Use function version
      * @see Patcher.requiredFiles
      */
    var requiredFiles: js.Array[String]
  }
  object RequiredFiles {
    
    inline def apply(requiredFiles: js.Array[String]): RequiredFiles = {
      val __obj = js.Dynamic.literal(requiredFiles = requiredFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredFiles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredFiles] (val x: Self) extends AnyVal {
      
      inline def setRequiredFiles(value: js.Array[String]): Self = StObject.set(x, "requiredFiles", value.asInstanceOf[js.Any])
      
      inline def setRequiredFilesVarargs(value: String*): Self = StObject.set(x, "requiredFiles", js.Array(value*))
    }
  }
}
