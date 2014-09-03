import com.codenvy.api.project.shared.dto.ProjectDescriptor;
import com.codenvy.ide.api.event.FileEvent;
import com.codenvy.ide.api.projecttree.generic.FileNode;
    private FileNode               file;
        presenter = new ResetToCommitPresenter(view, service, constant, eventBus, editorAgent, appContext, notificationManager,
        }).when(service).log((ProjectDescriptor)anyObject(), anyBoolean(), (AsyncRequestCallback<LogResponse>)anyObject());
        verify(appContext).getCurrentProject();
        verify(service).log(eq(projectDescriptor), eq(!IS_TEXT_FORMATTED), (AsyncRequestCallback<LogResponse>)anyObject());
        }).when(service).log((ProjectDescriptor)anyObject(), anyBoolean(), (AsyncRequestCallback<LogResponse>)anyObject());
        verify(appContext).getCurrentProject();
        verify(service).log(eq(projectDescriptor), eq(!IS_TEXT_FORMATTED), (AsyncRequestCallback<LogResponse>)anyObject());
        }).when(service).diff(eq(projectDescriptor), anyList(), eq(DiffRequest.DiffType.RAW), eq(true), eq(0), eq(PROJECT_PATH), eq(false),
        }).when(service)
          .reset((ProjectDescriptor)anyObject(), anyString(), (ResetRequest.ResetType)anyObject(), (AsyncRequestCallback<Void>)anyObject());
        verify(appContext, times(2)).getCurrentProject();
        verify(service).diff(eq(projectDescriptor), anyList(), eq(DiffRequest.DiffType.RAW), eq(true), eq(0), eq(PROJECT_PATH), eq(false),
        verify(service).reset((ProjectDescriptor)anyObject(), eq(PROJECT_PATH), eq(MIXED), (AsyncRequestCallback<Void>)anyObject());
            throws Exception {
        }).when(service).diff(eq(projectDescriptor), anyList(), eq(DiffRequest.DiffType.RAW), eq(true), eq(0), eq(PROJECT_PATH), eq(false),
        }).when(service)
          .reset((ProjectDescriptor)anyObject(), anyString(), (ResetRequest.ResetType)anyObject(), (AsyncRequestCallback<Void>)anyObject());
        verify(appContext, times(3)).getCurrentProject();
        verify(service).diff(eq(projectDescriptor), anyList(), eq(DiffRequest.DiffType.RAW), eq(true), eq(0), eq(PROJECT_PATH), eq(false),
        verify(service).reset((ProjectDescriptor)anyObject(), eq(PROJECT_PATH), eq(HARD), (AsyncRequestCallback<Void>)anyObject());
        verify(eventBus, times(2)).fireEvent((FileEvent)anyObject());
            throws Exception {
        }).when(service).diff(eq(projectDescriptor), anyList(), eq(DiffRequest.DiffType.RAW), eq(true), eq(0), eq(PROJECT_PATH), eq(false),
        }).when(service)
          .reset((ProjectDescriptor)anyObject(), anyString(), (ResetRequest.ResetType)anyObject(), (AsyncRequestCallback<Void>)anyObject());
        verify(appContext, times(3)).getCurrentProject();
        verify(service).diff(eq(projectDescriptor), anyList(), eq(DiffRequest.DiffType.RAW), eq(true), eq(0), eq(PROJECT_PATH), eq(false),
        verify(service).reset((ProjectDescriptor)anyObject(), eq(PROJECT_PATH), eq(MERGE), (AsyncRequestCallback<Void>)anyObject());
        }).when(service).diff(eq(projectDescriptor), anyList(), eq(DiffRequest.DiffType.RAW), eq(true), eq(0), eq(PROJECT_PATH), eq(false),
        verify(appContext).getCurrentProject();
        verify(service).diff(eq(projectDescriptor), anyList(), eq(DiffRequest.DiffType.RAW), eq(true), eq(0), eq(PROJECT_PATH), eq(false),
        verify(service, never()).reset((ProjectDescriptor)anyObject(), anyString(), (ResetRequest.ResetType)anyObject(),
        }).when(service).diff(eq(projectDescriptor), anyList(), eq(DiffRequest.DiffType.RAW), eq(true), eq(0), eq(PROJECT_PATH), eq(false),
        }).when(service).reset((ProjectDescriptor)anyObject(), anyString(), (ResetRequest.ResetType)anyObject(),
        verify(appContext, times(2)).getCurrentProject();
        verify(service).diff(eq(projectDescriptor), anyList(), eq(DiffRequest.DiffType.RAW), eq(true), eq(0), eq(PROJECT_PATH), eq(false),
        verify(service).reset((ProjectDescriptor)anyObject(), eq(PROJECT_PATH), eq(MIXED), (AsyncRequestCallback<Void>)anyObject());