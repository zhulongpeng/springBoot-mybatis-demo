package com.zlp.admin.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Getter
@Setter
public class UmsPermissionNode {

    private List<UmsPermissionNode> children;
}
