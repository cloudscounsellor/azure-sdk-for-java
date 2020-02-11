/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.Jobs;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.Job;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.RemoteLoginInformation;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.File;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.JobsListOutputFilesOptions;

class JobsImpl extends GroupableResourcesCoreImpl<Job, JobImpl, JobInner, JobsInner, BatchAIManager>  implements Jobs {
    protected JobsImpl(BatchAIManager manager) {
        super(manager.inner().jobs(), manager);
    }

    @Override
    protected Observable<JobInner> getInnerAsync(String resourceGroupName, String name) {
        JobsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        JobsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Job> listByResourceGroup(String resourceGroupName) {
        JobsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Job> listByResourceGroupAsync(String resourceGroupName) {
        JobsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<JobInner>, Iterable<JobInner>>() {
            @Override
            public Iterable<JobInner> call(Page<JobInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Job> list() {
        JobsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Job> listAsync() {
        JobsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<JobInner>, Iterable<JobInner>>() {
            @Override
            public Iterable<JobInner> call(Page<JobInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public JobImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<RemoteLoginInformation> listRemoteLoginInformationAsync(final String resourceGroupName, final String jobName) {
        JobsInner client = this.inner();
        return client.listRemoteLoginInformationAsync(resourceGroupName, jobName)
        .flatMapIterable(new Func1<Page<RemoteLoginInformationInner>, Iterable<RemoteLoginInformationInner>>() {
            @Override
            public Iterable<RemoteLoginInformationInner> call(Page<RemoteLoginInformationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RemoteLoginInformationInner, RemoteLoginInformation>() {
            @Override
            public RemoteLoginInformation call(RemoteLoginInformationInner inner) {
                return new RemoteLoginInformationImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable terminateAsync(String resourceGroupName, String jobName) {
        JobsInner client = this.inner();
        return client.terminateAsync(resourceGroupName, jobName).toCompletable();
    }

    @Override
    public Observable<File> listOutputFilesAsync(final String resourceGroupName, final String jobName, final JobsListOutputFilesOptions jobsListOutputFilesOptions) {
        JobsInner client = this.inner();
        return client.listOutputFilesAsync(resourceGroupName, jobName, jobsListOutputFilesOptions)
        .flatMapIterable(new Func1<Page<FileInner>, Iterable<FileInner>>() {
            @Override
            public Iterable<FileInner> call(Page<FileInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FileInner, File>() {
            @Override
            public File call(FileInner inner) {
                return new FileImpl(inner, manager());
            }
        });
    }

    @Override
    protected JobImpl wrapModel(JobInner inner) {
        return  new JobImpl(inner.name(), inner, manager());
    }

    @Override
    protected JobImpl wrapModel(String name) {
        return new JobImpl(name, new JobInner(), this.manager());
    }

}