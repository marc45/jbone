package com.majunwei.jbone.sys.service.model.organization;

import lombok.Data;

import java.util.List;

@Data
public class TreeOrganizationModel extends OrganizationBaseInfoModel {
    private List<TreeOrganizationModel> children;
}
